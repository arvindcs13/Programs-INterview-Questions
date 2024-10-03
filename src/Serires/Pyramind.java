package Serires;

public class Pyramind {

	public static void main(String[] args) {
		int n=0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(++n);
			}
			System.out.println();
		}

	}

}
