package date;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PPPPP {
public static void main(String[] args) {
	/*
	 * Converting string array to list
	 */
	String[] num_words = {"one", "two", "three", "four", "five"};
	
	List<String> li = new ArrayList<String>(Arrays.asList(num_words));
	System.out.println(li);
	
	/*
	 * Converting the char of string array to list
	 */
	String num_words1 = "onefivefgfsfsfsfjsfsfsf313131842427242";
	
	char []ch=num_words1.toCharArray();
	
	List<String> li2 = new ArrayList<String>(Arrays.asList(num_words1));
	
	System.out.println(li2);
	
}
}
