package Day_3;
public class LinkedList {
	 Node head;
	    class Node
	    {
	        int data;
	        Node next;
	        Node(int num)
	        {
	            data=num;
	        } 
	    }
	    public void insertData(int num)
	    {
	        Node newNode=new Node(num);
	        if (head==null) 
	        {
	            head=newNode;
	            newNode.next=null;
	        }
	        else
	        {     
	            newNode.next=head;
	            head=newNode;
	        }
	    }   	   
	    public void display()
	    {
	        Node temp=head;
	        while (temp!=null)
	        {
	            System.out.print(temp.data+"->");
	            temp=temp.next;
	        }
	       System.out.println("null");
	    }
	    public static void main(String[] args) {
			LinkedList ls = new LinkedList();
			ls.insertData(3);
			ls.insertData(34);
			ls.insertData(12);
			ls.insertData(5);
			ls.insertData(8);
			ls.insertData(6);
			ls.insertData(4);
			ls.insertData(9);
			ls.insertData(7);
			ls.display();
		}
}
