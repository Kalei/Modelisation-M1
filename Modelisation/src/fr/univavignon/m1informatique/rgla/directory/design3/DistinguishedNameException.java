package fr.univavignon.m1informatique.rgla.directory.design3;

public class DistinguishedNameException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DistinguishedNameException(String name) {
		System.err.println(name+" n'est pas un nom unique !");
		System.exit(0);
	}	
}
