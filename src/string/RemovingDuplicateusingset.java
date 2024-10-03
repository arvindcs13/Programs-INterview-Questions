package string;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemovingDuplicateusingset {
public static void main(String[] args) {
	
	String st="ABCABCABCABC";
	String st2=" ";
	Set<Character> set1= new HashSet<Character>();
	for(int i=0;i<st.length();i++) {
		set1.add(st.charAt(i));
	}
	Iterator ity = set1.iterator();
	while(ity.hasNext()) {
		st2=st2+ ity.next();
	}
	System.out.println(st2);
}
}
