package fr.univavignon.m1informatique.rgla.directory.design1.test;

import java.util.Scanner;

import fr.univavignon.m1informatique.rgla.directory.design1.DistinguishedName;

public class Reader {
	private DistinguishedName dN;
	private Writer writer;
	public Reader(Writer writer2){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		writer = writer2;
		Message dnoMessage = new Message(str, str);
		dN=dnoMessage.getDN();
		writer.write(dN);
	}
	
	

}
