package fr.univavignon.m1informatique.rgla.directory.analyse.test;

import fr.univavignon.m1informatique.rgla.directory.analyse.DistinguishedName;

public class User {
	private DistinguishedName distinguishedName;
	DNObject1 dnobj;
	
	public User(String name, DistinguishedName dN2){
		
		distinguishedName = dN2;
	}

	/**
	 * 
	 */
	 void m() {
		new DNObject1(distinguishedName);
		
	}
}
