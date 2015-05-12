package fr.univavignon.m1informatique.rgla.directory.design1.test;

import fr.univavignon.m1informatique.rgla.directory.design1.DistinguishedNamedObject;


public class Message extends DistinguishedNamedObject{
	
	private String message;

	public Message(String nom, String message) {
		super(nom);
		
		// TODO Auto-generated constructor stub
		this.message = message;
	}


	public String getMessage() {
		return message;
	}

}