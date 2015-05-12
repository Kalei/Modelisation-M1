package fr.univavignon.m1informatique.rgla.directory.design3.test;

import fr.univavignon.m1informatique.rgla.directory.design3.DistinguishedName;

public class Writer {
	
	/**
	 * 
	 */
	 void write(DistinguishedName dN) {
		String message = ((Message)dN.getDNO()).toString();
		System.out.println(message);
	}
}
