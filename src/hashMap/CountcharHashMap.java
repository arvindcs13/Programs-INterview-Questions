package hashMap;

import java.util.HashMap;
import java.util.Map;

public class CountcharHashMap {

	public static void countChar(String st) {
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		String st2=st.replace(" ", "");
		char ch[] = st2.toCharArray();
		
		for(char c : ch) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}
			else {
				charMap.put(c,1);
			}
		}
		System.out.println(charMap);
	}
	public static void main(String[] args) {
		countChar("Arv ind Yadav");
	}

}
