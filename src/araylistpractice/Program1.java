package araylistpractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program1 {

	public static void main(String[] args) {
//		ArrayList<String> sl = new ArrayList<String>();
//		sl.add("Arvind");
//		sl.add("Kavita");
//		sl.add("Pravin");
//		sl.add("Ankit");
//		sl.add(null);
//		sl.add("Baby");
//		
//		//Simply printing array list
//		System.out.println(sl);
//		
//		//Simply printing array list using Iterator
//		Iterator ity = sl.iterator();
//		while(ity.hasNext()) {
//			System.out.println(ity.next());
//		}
		
		
		//Comparing two arraylist
		
		ArrayList<String> sl2 = new ArrayList<String>();
		sl2.add("Arvind");
		sl2.add("Kavita");
		sl2.add("Pravin");
		sl2.add("Ankit");
		sl2.add("Baby");
		
		//removing all the element off s1=l and then verify which element is diiferent
//		sl.removeAll(sl2);
//		
//		System.out.println(sl); //O/p null
		
		Collection<Integer> cl= new ArrayList<>();
		cl.add(2);
		cl.add(3);
		cl.add(3);
		cl.add(4);
		Object[] arr=cl.toArray();
		
		
		for(Object iems:arr) {
			System.out.println(iems);
		}
		
		
		
		
	}

}
