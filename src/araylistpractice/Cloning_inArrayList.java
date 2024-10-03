package araylistpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Cloning_inArrayList {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Arvind");
		ar.add("mama");
		ar.add("kav");
		ar.add("mummy");
		ar.add("papa");
		ar.add("Arvind");
		ar.add("mama");
		ar.add("kav");
		ar.add("mummy");
		ar.add("papa");
		
		
	/*
	 * Cloning each element of ar to ar2
	 */
		
		ArrayList<String> ar2 = (ArrayList<String>)ar.clone();
	    System.out.println(ar2);
		
	}

}
