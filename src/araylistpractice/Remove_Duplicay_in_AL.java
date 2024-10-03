package araylistpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicay_in_AL {

	public static void main(String[] args) {
		
		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("Arvind");
		s1.add("Kavita");
		s1.add("Pravin");
		s1.add("Ankit");
		s1.add("Manish");
		s1.add("Baby");
		
		
		s1.add("Arvind");
		s1.add("Kavita");
		s1.add("Pravin");
		
		//Becoz set dont have duplicate values
		Set<String> s2 = new HashSet<String>(s1);
		System.out.println(s2);
		
	
		
		
		

	}

}
