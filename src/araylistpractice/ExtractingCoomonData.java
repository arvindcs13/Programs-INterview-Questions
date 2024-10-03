package araylistpractice;

import java.util.ArrayList;

public class ExtractingCoomonData {

	public static void main(String[] args) {
		/*
		 * the program is used to extract common data from two AL
		 * Ordering is allowed in  Arraylist
		 * Random Access is allowed in arrayList 
		 * Null elements are allowed in Arrayist
		 * Duplicate Element is allowed in ArrayList
		 * threadsafty is not not there 
		 */
		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("Arvind");
		s1.add("Kavita");
		s1.add("Pravin");
		s1.add("Ankit");
		s1.add("Manish");
		s1.add("Baby");
		
		//ordering with index
		s1.add(0, "Abhinav");
		
		System.out.println(s1);
		
		System.out.println(s1.get(5));
		
		ArrayList<String> s2 = new ArrayList<String>();
		s2.add("Arvind");
		s2.add("Kavita");
		s2.add("Pravin");
		
		
		s2.add("Baby");
		
		//Ye method saare elements ko retain kr lega s2 k
		s1.retainAll(s2);
		
		System.out.println(s1);
	}

}
