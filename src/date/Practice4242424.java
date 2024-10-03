package date;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Practice4242424 {
	
	public static void countChar(String name) {
		String name2 = name.replace(" ", "");
		char []ch = name2.toCharArray();
		
		Map<Character,Integer> num = new HashMap<Character,Integer>();
		
		//conditions
		for( char c : ch) {
			if(num.containsKey(c)) {
				num.put(c, num.get(c)+1);
			}
			else {
				num.put(c, 1);
			}
		}
		
		for(Entry m : num.entrySet()) {
			System.out.println(m.getKey()+" :"+m.getValue());
		}
	}

	public static void main(String[] args) {
		countChar("Mahabharat");

	}

}
