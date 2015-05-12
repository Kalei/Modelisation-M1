/**
 * 
 */
package fr.univavignon.m1informatique.rgla.directory.design1;


public class DistinguishedNamedObject {

	private DistinguishedName dn;
	/**
	 * 
	 */
	public DistinguishedNamedObject(String name) {
		dn= new DistinguishedName(name);
		DistinguishedNamedObjectServer.addDno(this);
	}

	public DistinguishedNamedObject(DistinguishedName dName) {
	}

	public DistinguishedName getDN(){
		return dn;
		
	}

	
}
