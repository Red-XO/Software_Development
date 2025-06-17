package Day_6;
public class Stack {
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
		Stack st = new Stack();
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(7);
		st.push(34);
		st.push(8);
		st.pop();
		st.pop();
		st.display();
	}
}
