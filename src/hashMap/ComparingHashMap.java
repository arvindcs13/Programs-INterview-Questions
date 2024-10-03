package hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class ComparingHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
		hm1.put(1, "Arvind");
		hm1.put(2, "Pravin");
		hm1.put(3, "Ankit");
		hm1.put(4, "Kavita");
		hm1.put(5, "Viplav");
		hm1.put(6, "Sarita");
		
		HashMap<Integer,String> hm2 = new HashMap<Integer,String>();
		hm2.put(1, "Arvind");
		hm2.put(2, "Pravin");
		hm2.put(3, "Ankit");
		
		//Comparing two hashmap on the basis of Key Value
//		System.out.println(hm2.equals(hm1));
		
		//finding out the additional items in hashmap
	    HashSet<Integer> set = new HashSet<Integer>(hm1.keySet());
	    set.removeAll(hm2.keySet());
	    for(int items:set) {
	    	System.out.println(" Key :"+items +" Value :"+hm1.get(items));
	    }
	    
	    hm1.va

	}

}
