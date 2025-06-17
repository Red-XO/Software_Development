package Day_3;
public class InsertAtPosition {
	class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	    Node head;
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
	    public void insert(int data, int position) {
	        if (position < 1) {
	            System.out.println("Invalid position!");
	            return;
	        }
	        Node newNode = new Node(data);
	        if (position == 1) {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }
	        Node temp = head;
	        for (int i = 1; temp != null && i < position - 1; i++) {
	            temp = temp.next;
	        }
	        if (temp == null) {
	            System.out.println("Position exceeds list length!");
	            return;
	        }
	        newNode.next = temp.next;
	        temp.next = newNode;
	    }
	    public void display() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("NULL");
	    }
	    public static void main(String[] args) {
	    	InsertAtPosition is = new InsertAtPosition();
	        is.insertData(10);
	        is.insertData(20);
	        is.insertData(24);
	        is.insertData(25);
	        is.insertData(30);
	        is.insertData(32);
	        is.insertData(34);
	        is.insert(15, 2);
	        is.display();
	    }
}
