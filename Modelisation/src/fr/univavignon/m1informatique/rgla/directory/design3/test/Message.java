package fr.univavignon.m1informatique.rgla.directory.design3.test;

import fr.univavignon.m1informatique.rgla.directory.design3.DistinguishedNameException;
import fr.univavignon.m1informatique.rgla.directory.design3.DistinguishedNamedObject;
import fr.univavignon.m1informatique.rgla.directory.design3.DistinguishedNamedObjectServer;


public class Message extends DistinguishedNamedObject{
	
	private String message;

	public Message(String nom, String message, DistinguishedNamedObjectServer server) throws DistinguishedNameException{
		super(nom,server);
		this.message = message;
	}


	public String toString() {
		return message;
	}

}