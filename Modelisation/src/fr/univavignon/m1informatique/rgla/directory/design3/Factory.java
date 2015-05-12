package fr.univavignon.m1informatique.rgla.directory.design3;

import fr.univavignon.m1informatique.rgla.directory.design3.local2.Local2DistinguishedNameObjectServer;
import fr.univavignon.m1informatique.rgla.directory.design3.local1.Local1DistinguishedNameObjectServer;

public class Factory {
	
	public DistinguishedNamedObjectServer getServer(Local1DistinguishedNameObjectServer server){
		server = Local1DistinguishedNameObjectServer.getInstance();
		return server;
	}
	
	public DistinguishedNamedObjectServer getServer(Local2DistinguishedNameObjectServer server){
		server = Local2DistinguishedNameObjectServer.getInstance();
		return server;
	}

}
