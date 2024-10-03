package string;

public class Abc {

	public static void main(String[] args) {
		
		String s = "Ravi is talented boy";

		String st1 ="";
		String st2="";
		String st3;
        String temp;
		String []arr = s.split(" ");

		for(int i=0 ;i<arr.length;i++)
		{

			temp=arr[i];
			
		for(int j=0; j<arr[i].length();j++)
			
		{
			char ch = temp.charAt(j);
			
			 if( ch=='a' || ch =='e' || ch=='i' || ch =='o' || ch =='u'){
				    st1 =st1+ temp.charAt(j);

				     }
				else{
					
				   st2=st2+temp.charAt(j);
				   
				}
			 
		}
		  
		st3=st2+st1;
		  System.out.println(st3+" ");
		  temp=null;
	}
		
		
	}
	
}
