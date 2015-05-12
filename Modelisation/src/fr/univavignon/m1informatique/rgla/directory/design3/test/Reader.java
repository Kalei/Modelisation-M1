package fr.univavignon.m1informatique.rgla.directory.design3.test;

import java.util.Scanner;

import fr.univavignon.m1informatique.rgla.directory.design3.DistinguishedNameException;
import fr.univavignon.m1informatique.rgla.directory.design3.DistinguishedName;
import fr.univavignon.m1informatique.rgla.directory.design3.DistinguishedNamedObjectServer;

public class Reader {
	private DistinguishedName dN;
	private Writer writer;
	public Reader(Writer writer2, DistinguishedNamedObjectServer server){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		writer = writer2;
		
		try{
			Message dnoMessage = new Message(str, str,server);
			dN = dnoMessage.getDN();
		}
		catch(DistinguishedNameException e){}

		writer.write(dN);
	}
	
	

}
