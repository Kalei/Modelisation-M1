package fr.univavignon.m1informatique.rgla.directory.design2.test;

import java.util.Scanner;

import fr.univavignon.m1informatique.rgla.directory.design2.DistinguishedName;
import fr.univavignon.m1informatique.rgla.directory.design2.DistinguishedNamedObjectServer;

public class Reader {
	private DistinguishedName dN;
	private Writer writer;
	public Reader(Writer writer2, DistinguishedNamedObjectServer server){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		writer = writer2;
		Message dnoMessage = new Message(str, str,server);
		dN = dnoMessage.getDN();
		writer.write(dN);
	}
	
	

}
