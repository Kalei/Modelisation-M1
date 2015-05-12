/**
 * 
 */
package fr.univavignon.m1informatique.rgla.directory.design3;

import fr.univavignon.m1informatique.rgla.directory.design3.DistinguishedNameException;


public class DistinguishedNamedObject {

	private DistinguishedName dn;
	/**
	 * 
	 */
	public DistinguishedNamedObject(String name,DistinguishedNamedObjectServer server) throws DistinguishedNameException{
		try{
			dn= new DistinguishedName(name,server);
			server.addDno(this);
		}
		catch(DistinguishedNameException e){}
	}

	public DistinguishedNamedObject(DistinguishedName dName) {
	}

	public DistinguishedName getDN(){
		return dn;
		
	}

	
}
