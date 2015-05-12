package fr.univavignon.m1informatique.rgla.directory.design2.test;

import fr.univavignon.m1informatique.rgla.directory.design2.DistinguishedNamedObject;
import fr.univavignon.m1informatique.rgla.directory.design2.DistinguishedNamedObjectServer;


public class Message extends DistinguishedNamedObject{
	
	private String message;

	public Message(String nom, String message, DistinguishedNamedObjectServer server) {
		super(nom,server);
		
		// TODO Auto-generated constructor stub
		this.message = message;
	}


	public String getMessage() {
		return message;
	}

}