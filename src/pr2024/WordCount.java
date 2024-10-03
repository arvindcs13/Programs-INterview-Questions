package pr2024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class WordCount {

	public static void main(String[] args) {
		String sentence="this is an an is interview interview interview interview";
		String []arr=sentence.split(" ");
		
	HashMap<String,Integer> hm = new HashMap<String, Integer>();
	int i=0;
	for(String words : arr) {
		if(hm.containsKey(words)) {
			hm.put(words, hm.get(words)+1);
		}
		else {
			hm.put(words, 1);
		}
	}
	
	System.out.println(hm);
		
	}
}
		


		

