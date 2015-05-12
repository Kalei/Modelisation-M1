/**
 * 
 */
package fr.univavignon.m1informatique.rgla.directory.analyse;


/**
 * @author Dante
 *
 */
public class DistinguishedNamedObject {

	private DistinguishedName distinguishedName;
	/**
	 * 
	 */
	public DistinguishedNamedObject(String name) {
		DistinguishedNameObjectServer distinguishedNameObjectServer = new DistinguishedNameObjectServer();
		distinguishedName= new DistinguishedName(name);
		
	}

	public DistinguishedNamedObject(DistinguishedName dName) {
	}

	public DistinguishedName getDN(){
		return distinguishedName;
		
	}

	
}
