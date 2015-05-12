package fr.univavignon.m1informatique.rgla.directory.analyse;

public class DistinguishedName {


	//private DistinguishedNamedObject dno;
	private String name;
	
	public String getName(){
		return name;
	}
	
	public DistinguishedNamedObject getDNO(){
		return getDNO();
	}
	
	public DistinguishedName(String name) {
		DistinguishedNameObjectServer distinguishedNameObjectServer = new DistinguishedNameObjectServer();
		this.name=name;
	}
}
