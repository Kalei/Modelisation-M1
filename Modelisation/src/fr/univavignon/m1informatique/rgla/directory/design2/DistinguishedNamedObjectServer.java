package fr.univavignon.m1informatique.rgla.directory.design2;

public abstract class DistinguishedNamedObjectServer {
	
	public abstract void addDno(DistinguishedNamedObject dno);
	
	public abstract boolean existDno(DistinguishedName dn);
	
	public abstract DistinguishedNamedObject getDno(String name);
}
