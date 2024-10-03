package date;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ComparingTwoMaps {
	public static void main(String[] args) {
		Map<Integer,String> num = new HashMap<Integer,String>();
		num.put(1, "A");
		num.put(2, "B");
		num.put(3, "C");
		
		
		Map<Integer,String> num2 = new HashMap<Integer,String>();
		num2.put(2, "B");
		num2.put(3, "C");
		num2.put(1, "A");
		
		
		Map<Integer,String> num3 = new HashMap<Integer,String>();
		num3.put(2, "D");
		num3.put(3, "C");
		num3.put(4, "A");
		
		
		//Comparing two maps on the basis of keys-values
		System.out.println(num2.equals(num));   //true   comparing num1 & num2
		System.out.println(num2.equals(num3));   //false  comparing num2 & num3
		
		
		//Comparing two maps on the basis of keys
		System.out.println(num2.keySet().equals(num.keySet()));  //true   comparing on Key num1 & num2
		
		
		System.out.println(num2.keySet().equals(num3.keySet())); //false   comparing on Key num3 & num2
		
		
		
		
	}

	
}
