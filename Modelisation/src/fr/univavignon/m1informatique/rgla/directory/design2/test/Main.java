package fr.univavignon.m1informatique.rgla.directory.design2.test;

import fr.univavignon.m1informatique.rgla.directory.design2.DistinguishedNamedObjectServer;
import fr.univavignon.m1informatique.rgla.directory.design2.local1.Local1DistinguishedNameObjectServer;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Main t=new Main();
		t.domain();

	}

	/**
	 * 
	 */
	 public void domain() {
		 Writer writer=new Writer();
		 DistinguishedNamedObjectServer server = Local1DistinguishedNameObjectServer.getInstance();
		 new Reader(writer,server);
		
	}

}
