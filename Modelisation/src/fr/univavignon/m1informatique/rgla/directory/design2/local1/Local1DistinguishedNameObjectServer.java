package fr.univavignon.m1informatique.rgla.directory.design2.local1;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.m1informatique.rgla.directory.design2.*;

public class Local1DistinguishedNameObjectServer extends DistinguishedNamedObjectServer{
	private List<DistinguishedNamedObject> dnoList;
	private static Local1DistinguishedNameObjectServer instance = null;
	
	private Local1DistinguishedNameObjectServer(){
		dnoList = new ArrayList<DistinguishedNamedObject>();
	}
	
	public static Local1DistinguishedNameObjectServer getInstance(){
		if(instance == null){
			instance = new Local1DistinguishedNameObjectServer();
		}
		return instance;
	}
	
	public void addDno(DistinguishedNamedObject dno){
		dnoList.add(dno);
	}
	
	public boolean existDno(DistinguishedName dn){
		for(int i=0;i<dnoList.size();i++){
			if(dn.getName().equals(dnoList.get(i).getDN().getName())){
				return true;
			}
		}
		return false;
	}
	
	public DistinguishedNamedObject getDno(String name){
		for(int i=0;i<dnoList.size();i++){
			if(name.equals(dnoList.get(i).getDN().getName())){
				return dnoList.get(i);
			}
		}
		return null;
	}
}
