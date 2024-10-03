package hashMap;

import java.util.HashMap;
import java.util.Iterator;

public class Hashing {

	public static void main(String[] args) {
		HashMap<Integer,String> jp = new HashMap<Integer,String>();
		
		//putting the values
		jp.put(1, "Arvind");
		jp.put(2, "Abhinav");
		jp.put(3, "Akshat");
		jp.put(4, "Akira");
		
		Iterator<Integer> it = jp.keySet().iterator();
		
		while(it.hasNext()) {
			int i=it.next();
			String st= jp.get(i);
			System.out.println(i+"===="+st);
		}

	}

}
