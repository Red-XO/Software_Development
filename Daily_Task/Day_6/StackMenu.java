package Day_6;

import java.util.Scanner;

public class StackMenu {
	int myStack[]=new int[5];
	int top=-1;
	public  void push(int num)
	{
		if(top>=4)
		{
			System.out.print("Stack overflow");
		}
		else
		{
		myStack[++top]=num;
		}
	}
	public void pop()
	{		
		if(top<0)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println(myStack[top]);
			myStack[top]=0;
			top--;
		}				
	}
	public void display()
	{
		for(int i=0;i<myStack.length;i++)
		{
			System.out.print(myStack[i]+" ");
		}
	}
	public static void main(String[] args) {
		StackMenu sm = new StackMenu();
		Scanner sc = new Scanner(System.in);
		System.out.println("Stack Operations");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.println("3.Display");
		System.out.println("4.Exit");
		while(true) {
			System.out.println("Enter Your Choice:");
			int a = sc.nextInt();
			switch(a) {
			case 1:
				System.out.println("Enter a Number:");
				int b= sc.nextInt();
				sm.push(b);
				break;
			case 2:
				sm.pop();
				break;
			case 3:
				sm.display();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
			}
		}
	}
}
