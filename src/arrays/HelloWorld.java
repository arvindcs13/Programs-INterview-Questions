package arrays;

class HelloWorld {
    public static void main(String[] args) {
       int []arr={32,46,23,18,55,75};
       int min;
       int temp=0;
       for(int i=0;i<arr.length;i++){
           min=i;
           for(int j=i+1;j<arr.length;j++){
               if(arr[j]<arr[min]){
                   min=j;
           }
           
       }
           temp=arr[i];
           arr[i]=arr[min];
           arr[min]=temp;
    }
    for(int k=0;k<arr.length;k++){
        System.out.println(arr[k]);
    }
    
}
}