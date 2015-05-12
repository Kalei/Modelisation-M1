package fr.univavignon.m1informatique.rgla.directory.design2.test;

import fr.univavignon.m1informatique.rgla.directory.design2.DistinguishedName;

public class Writer {
	
	/**
	 * 
	 */
	 void write(DistinguishedName dN) {
		String message = ((Message)dN.getDNO()).getMessage();
		System.out.println(message);
	}
}
