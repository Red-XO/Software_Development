package Day_5;
public class Circular_List {
	class Node
	{
		int data;
	    Node next;
	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	Node head = null;
	Node last = null;
	public void add(int data) {
		Node newNode = new Node(data);
	    if (head == null) {
	    	head = newNode;
	        last = newNode;
	        last.next = head;
	        }
	    else{
	    	last.next = newNode;
	        last = newNode;
	        last.next = head; 
	        }
	    }
	public void display() {
		if (head == null) {
	    System.out.println("List is empty");
	    return;
	    }
		Node temp = head;
	    do {
	    	System.out.print(temp.data + " -> ");
	        temp = temp.next;
	        } while (temp != head);
	    System.out.println(temp.data);
	    }
	public static void main(String[] args) {
		Circular_List ts = new Circular_List();
		ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(40);
        ts.display();
        }
}
