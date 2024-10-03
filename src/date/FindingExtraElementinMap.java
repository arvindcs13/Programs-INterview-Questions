package date;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindingExtraElementinMap {

	public static void main(String[] args) {
		Map<Integer,String> num = new HashMap<Integer,String>();
		num.put(1, "A");
		num.put(2, "B");
		num.put(3, "C");
		
		
		Map<Integer,String> num2 = new HashMap<Integer,String>();
		num2.put(2, "B");
		num2.put(3, "C");
		num2.put(1, "A");
		num2.put(4, "E");
		
		
		Set<Integer> ar = new HashSet<Integer>(num.keySet()); //Converting Map to Set on the basis of Keys of num map
		ar.addAll(num2.keySet());  //Combining the keys of map1 & map2 
		
		ar.removeAll(num.keySet());   //removing all the elements of map1
		                                   // and
		System.out.println(ar);     //printing the keys which is extra in map2
		

	}

}
