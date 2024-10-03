package date;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ComparingTwoMapsOnValues {

	public static void main(String[] args) {
		Map<Integer,String> num = new HashMap<Integer,String>();
		num.put(1, "A");
		num.put(2, "B");
		num.put(3, "C");
		
		
		Map<Integer,String> num2 = new HashMap<Integer,String>();
		num2.put(9, "A");
		num2.put(11, "B");
		num2.put(14, "C");
		num2.put(11, "B");
		num2.put(14, "C");
		
		
		Map<Integer,String> num3 = new HashMap<Integer,String>();
		num3.put(11, "B");
		num3.put(10, "C");
		num3.put(9, "Z");
		
		
		//not present duplicate elements then we use arraylist 
		System.out.println(new ArrayList<>(num.values()).equals(new ArrayList<>(num2.values())));
		 
		System.out.println(new ArrayList<>(num2.values()).equals(new ArrayList<>(num3.values())));
		
		
		//present duplicate elements then we use HASHSET 

	}

}
