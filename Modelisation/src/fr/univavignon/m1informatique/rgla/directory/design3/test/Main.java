package fr.univavignon.m1informatique.rgla.directory.design3.test;

import fr.univavignon.m1informatique.rgla.directory.design3.DistinguishedNameException;
import fr.univavignon.m1informatique.rgla.directory.design3.DistinguishedNamedObjectServer;
import fr.univavignon.m1informatique.rgla.directory.design3.local1.Local1DistinguishedNameObjectServer;
import fr.univavignon.m1informatique.rgla.directory.design3.local2.Local2DistinguishedNameObjectServer;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws DistinguishedNameException{
		
		Main t=new Main();
		t.domain();

	}

	/**
	 * 
	 */
	 public void domain(){
		 while(true){
			 
			 System.out.println("Serveur ListDno :");
			 Writer writer=new Writer();
			 DistinguishedNamedObjectServer server = Local1DistinguishedNameObjectServer.getInstance();
			 
			 new Reader(writer,server);
			 
			 
			 if(writer.equals("exit")) break;
			 
			 System.out.println("Serveur TabDno :");
			 writer=new Writer();
			 DistinguishedNamedObjectServer server1 = Local2DistinguishedNameObjectServer.getInstance();
			 new Reader(writer,server1);
			 
			 if(writer.equals("exit")) break;
		 }
	}

}
