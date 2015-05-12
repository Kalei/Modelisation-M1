package fr.univavignon.m1informatique.rgla.directory.design2;

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
	
	public DistinguishedName(String name,DistinguishedNamedObjectServer server) {
		this.name=name;
		this.server=server;
		if(server.existDno(this)){
			System.out.println("Erreur DNO non unique");
			System.exit(0);
		}
	}
}
