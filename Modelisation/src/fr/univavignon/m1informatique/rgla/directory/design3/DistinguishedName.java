package fr.univavignon.m1informatique.rgla.directory.design3;

import fr.univavignon.m1informatique.rgla.directory.design3.DistinguishedNameException;

public class DistinguishedName {


	//private DistinguishedNamedObject dno;
	private String name;
	private DistinguishedNamedObjectServer server;
	public String getName(){
		return name;
	}
	
	public DistinguishedNamedObject getDNO(){
		return server.getDno(name);
	}
	
	public String toString(){
		return name;
	}
	
	public DistinguishedName(String name,DistinguishedNamedObjectServer server) 
			throws DistinguishedNameException{
			this.name=name;
			this.server=server;
			
			if(server.existDno(this)){
				throw new DistinguishedNameException(name);
			}
	}
}
