package fr.univavignon.m1informatique.rgla.directory.design1;

import java.util.ArrayList;
import java.util.List;


public class DistinguishedNamedObjectServer {
	
	private static List<DistinguishedNamedObject> listDno = new ArrayList<DistinguishedNamedObject>();
	
	public static void addDno(DistinguishedNamedObject dno){
		listDno.add(dno);
	}
	
	public static boolean existDno(DistinguishedName dn){
		for(int i=0;i<listDno.size();i++){
			if(dn.getName().equals(listDno.get(i).getDN().getName())){
				return true;
			}
		}
		return false;
	}
	
	public static DistinguishedNamedObject getDno(String name){
		for(int i=0;i<listDno.size();i++){
			if(name.equals(listDno.get(i).getDN().getName())){
				return listDno.get(i);
			}
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println("Veuillez simplement choisir la méthode de connection...");
	}
	
}
