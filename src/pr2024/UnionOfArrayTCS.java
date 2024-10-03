package pr2024;

import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class UnionOfArrayTCS {
	
public static void main(String[] args) {
	 
	  int []arr1={1,2,4,5,6,8};
	   int []arr2={1,2,5,7,9,10};
	HashSet<Integer> st= new HashSet<Integer>();

	for(int i=0;i<arr1.length;i++)
	{
		st.add(arr1[i]);
		st.add(arr2[i]);
	}
	
//	System.out.println(st);
	
//	java.util.Iterator<Integer>  it= st.iterator();
	int[] unionAssray = new int[st.size()];
	int index=0;
//	while(it.hasNext()) {
//		unionAssray[i]=it.next();
//		i++;
//	}
	for (int num : st) {
		unionAssray[index++] = num;
    }
	
	for(int items :unionAssray) {
		System.out.print(items +" ");
	}
}
}
