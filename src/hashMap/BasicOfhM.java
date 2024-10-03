package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class BasicOfhM {

	public static void main(String[] args) {
		HashMap<String, String> capitalmap = new HashMap<String, String>();

		// to tstore data
		capitalmap.put("India", "New Delhi");
		capitalmap.put("UK", "London");
		capitalmap.put("USA", "Washington");
		capitalmap.put(null, "Berlin");
		capitalmap.put("UP", null);
		capitalmap.put("Bengal", null);

		// using itraror set
		Iterator<String> it = capitalmap.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println("Key=" + key + " Value=" + capitalmap.get(key));
		}

		System.out.println("_____________________________________________________");
		// Entry SET using to itrate

		Iterator<Entry<String, String>> ent = capitalmap.entrySet().iterator();
		while (ent.hasNext()) {
			Entry<String, String> items = ent.next();
			System.out.println("Country :" + items.getKey() + "City :" + items.getValue());

		}

		// using lambda expreseeion
//		 String k;
//		 String v;
		System.out.println("_____________________________________________________");
		capitalmap.forEach((k, v) -> System.out.println("Country :" + k + "City :" + v));

	}
}
