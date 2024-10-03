package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemovingDuplicates {

	public static void main(String[] args) {
		int arr[]= {22,55,46,55,78,55};
		
		HashSet<Integer> has = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			has.add(arr[i]);
		}

		System.out.println(has);
	}

}
