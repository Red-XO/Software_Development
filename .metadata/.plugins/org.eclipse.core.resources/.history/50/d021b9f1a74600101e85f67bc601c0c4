package Day_3;

public class Task_3 {
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
	public void deleteAtPosition(int position) {
	    if (head == null || position < 0) {
	        System.out.println("Invalid position or empty list!");
	        return;
	    }
	    Node temp = head;
	    if (position == 0) {
	        head = head.next;
	        return;
	    }
	    int index = 0;
	    while (temp != null && index < position - 1) {
	        temp = temp.next;
	        index++;
	    }
	    if (temp == null || temp.next == null) {
	        System.out.println("Position out of bounds!");
	        return;
	    }
	    temp.next = temp.next.next;
	    }
	public void printList() {
		Node temp = head;
	    while (temp != null) {
	    	System.out.print(temp.data + " -> ");
	        temp = temp.next;
	        }
	    System.out.println("null");
	    }
public static void main(String args[]) {
	Task_3 ts = new Task_3();
	ts.add(10);
	ts.add(20);
	ts.add(30);
	ts.add(40);
	ts.add(50);
	ts.add(60);
	ts.deleteAtPosition(2);
	ts.deleteAtPosition(1);
	ts.deleteAtPosition(3);
	ts.printList();
}
}
