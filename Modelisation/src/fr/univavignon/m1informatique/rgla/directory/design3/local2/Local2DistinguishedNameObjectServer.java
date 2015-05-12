package fr.univavignon.m1informatique.rgla.directory.design3.local2;

import fr.univavignon.m1informatique.rgla.directory.design3.*;

public class Local2DistinguishedNameObjectServer extends DistinguishedNamedObjectServer{
	private DistinguishedNamedObject[] dnoTab;
	private static Local2DistinguishedNameObjectServer instance = null;
	
	private Local2DistinguishedNameObjectServer(){
		dnoTab = new DistinguishedNamedObject[1024];
	}
	
	public static Local2DistinguishedNameObjectServer getInstance(){
		if(instance == null){
			instance = new Local2DistinguishedNameObjectServer();
		}
		return instance;
	}
	
	public void addDno(DistinguishedNamedObject dno){
		for(int i=0; i<dnoTab.length;i++){
			if(dnoTab[i]==null){
				dnoTab[i]=dno;
				break;
			}
		}
	}
	
	public boolean existDno(DistinguishedName dn){
		int i=0;
		while(dnoTab[i]!=null || i==1024){
			if(dn.getName().equals(dnoTab[i].getDN().getName())){
				return true;
			}
			i++;
		}
		return false;
	}
	
	public DistinguishedNamedObject getDno(String name){
		int i=0;
		while(dnoTab[i]!=null || i==1024){
			if(name.equals(dnoTab[i].getDN().getName())){
				return dnoTab[i];
			}
			i++;
		}
		return null;
	}
}