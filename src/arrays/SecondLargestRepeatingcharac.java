package arrays;

public class SecondLargestRepeatingcharac {

	public static void main(String[] args) {
		int []marks = {75,85,96,32,45,96};
		
		int highest = Integer.MIN_VALUE;
		int sec_high = Integer.MIN_VALUE;
		
		for(int i =0;i<marks.length;i++) {
			if(marks[i]>highest) {
				sec_high=highest;
				highest = marks[i];
			}
			if(marks[i]<highest && marks[i]>sec_high) {
				sec_high=marks[i];
			}
		}
		System.out.println("Second Highest value in array is : "+sec_high);

	}

}
