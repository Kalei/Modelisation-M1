package fr.univavignon.m1informatique.rgla.directory.design1;

public class DistinguishedName {


	//private DistinguishedNamedObject dno;
	private String name;
	
	public String getName(){
		return name;
	}
	
	public DistinguishedNamedObject getDNO(){
		return DistinguishedNamedObjectServer.getDno(name);
	}
	
	public DistinguishedName(String name) {
		this.name=name;
		if(DistinguishedNamedObjectServer.existDno(this)){
			System.out.println("Erreur DNO non unique");
			System.exit(0);
		}
	}
}
