/**
 * 
 */
package fr.univavignon.m1informatique.rgla.directory.design2;


public class DistinguishedNamedObject {

	private DistinguishedName dn;
	/**
	 * 
	 */
	public DistinguishedNamedObject(String name,DistinguishedNamedObjectServer server){
		dn= new DistinguishedName(name,server);
		server.addDno(this);
	}

	public DistinguishedNamedObject(DistinguishedName dName) {
	}

	public DistinguishedName getDN(){
		return dn;
		
	}

	
}
