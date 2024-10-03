package arrays;

public class Smallest_and_largest {

	public static void main(String[] args) {
		int []arr = {11,2,43,4,5,66,66};
		 int largest = arr[0];
		 int smallest = arr[0];
		 
		 for(int i=1;i<arr.length;i++) {
			 if(arr[i]>largest) {
				 largest=arr[i];
			 }
			 else if(arr[i]<smallest) {
				 smallest=arr[i];
			 }
		 }
		 
		 System.out.println("Smallest= "+smallest);
		 System.out.println("largest= "+largest);

	}

}
