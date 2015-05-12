package fr.univavignon.m1informatique.rgla.directory.design1.test;

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
		 new Reader(writer);
		
	}

}
