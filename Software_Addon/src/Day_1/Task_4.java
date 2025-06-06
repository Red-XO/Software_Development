package Day_1;

public class Task_4 {
public static void main(String args[]) {
	int min=0;
	int max=0;
	        int[] arr = {12, 3, 45, 7, 18, 8};
	        min=arr[0];
	        max=arr[0];
	       for(int i=0;i<arr.length;i++) {
	    	   if(arr[i]<min) {
	    		   min = arr[i];
	    	   }
	    	   if(arr[i]>max) {
	    		   max = arr[i];
	    	   }
	       }
	 System.out.println(min);
	 System.out.println(max);
}
}
