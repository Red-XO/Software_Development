package Day_3;

public class Task_4 {
	Node head;
	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
	    head = newNode;
	    }
		else {
			Node temp = head;
	        while (temp.next != null) {
	        temp = temp.next;
	        }
	        temp.next = newNode;
	        }
		}
	public void reverse() {
	    Node prev = null;
	    Node current = head;
	    Node next = null;
	    while (current != null) {
	        next = current.next;
	        current.next = prev;
	        prev = current; 
	        current = next; 
	    }
	    head = prev; 
	    }
	public void printList() {
		Node temp = head;
	    while (temp != null) {
	    	System.out.print(temp.data + " -> ");
	        temp = temp.next;
	        }
	    System.out.println("null");
	    }
	public static void main(String[] args) {
		Task_4 ts = new Task_4();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		ts.add(60);
		ts.reverse();
		ts.printList();
	}

}
