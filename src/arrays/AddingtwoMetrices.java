package arrays;

public class AddingtwoMetrices {

	public static void main(String[] args) {
		int [][]mat1= {
				{1,2,3},
				{4,5,6}
		};

		int mat2[][]={
				{1,2,3},
				{4,5,6}
		};
		int [][]result ={
				{0,0,0},
				{0,0,0}
		};
		for(int i=0;i<mat1.length;i++)//rows number of time 
			{
			for(int j=0;j<mat1[i].length;j++)  //coloumn number of time 
				
			{
				result[i][j]=mat1[i][j]+mat2[i][j];
				System.out.print(result[i][j]+" ");
		}
			System.out.println();
	}

}
}