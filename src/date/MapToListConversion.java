package date;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapToListConversion {
	/*
	 * This program is of converting 
	 */

	public static void main(String[] args) {
		Map<String,Integer> num = new HashMap<String,Integer>();
		num.put("Arvind", 50000);
		num.put("Baby", 60000);
		num.put("Kavita", 70000);
		num.put("Arvind", 80000);
		num.put("pravin", 100000);
		
		for(Entry m : num.entrySet()) {
			System.out.println(m.getKey()+" :"+m.getValue());
		}
		
		System.out.println("+++++++++++++++++++++++++++");
		List<String> li = new ArrayList<String>(num.keySet());
		System.out.println(li);
		
		List<Integer> li2 = new ArrayList<Integer>(num.values());
		System.out.println(li2);
	}

}
