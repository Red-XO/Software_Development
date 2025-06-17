package Day_8;
import java.util.Scanner;
public class LinearSearch {
	public void linear()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		System.out.println("Enter the values of an array:");
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
			 arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be find :");
		int find=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<size;i++)
		{
			if(find==arr[i])
			{
				System.out.println("Element found at index "+i);
				flag=true;
				break;
				
			}	
			
		}
		if(flag==false)
		{
			
			System.out.println("Element not found");
		}
		sc.close();
	}
	public static void main(String[] args) {
		LinearSearch ls = new LinearSearch();
		ls.linear();
	}
}
