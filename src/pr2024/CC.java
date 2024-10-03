package pr2024;

import java.util.ArrayList;
import java.util.HashSet;

public class CC {

	public static void main(String[] args) {
		int []arr1={1,2,4,5,6,8};
		   int []arr2={1,2,5,7,9,10};
		ArrayList<Integer> st= new ArrayList<Integer>();

		for(int i=0;i<arr1.length;i++)
		{
			st.add(arr1[i]);
			
		}
		
		ArrayList<Integer> st1= new ArrayList<Integer>();
		for(int i=0;i<arr2.length;i++)
		{
			
			st1.add(arr2[i]);
		}
		
		st1.removeAll(st); // remove all the element that are part of st [7, 9, 10]
//		st1.containsAll(st); //returns all the element which are part of st {1,2,5,7,9,10};
//		st1.retainAll(st); // remove all the element that are not  part of st //[1, 2, 5]
		
		System.out.println(st1);

	}

}
