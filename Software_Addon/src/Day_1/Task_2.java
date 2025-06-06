package Day_1;

import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
     int arr[] = {1,2,3,4,5};
     Scanner a = new Scanner(System.in);
     int value = a.nextInt();
     int index = a.nextInt();
     arr[index]=value;
     for(int i=0;i<arr.length;i++) {
    	 System.out.println(arr[i]);
     }
     a.close();
	}

}
