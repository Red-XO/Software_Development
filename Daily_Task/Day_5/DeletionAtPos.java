package Day_5;
public class DeletionAtNode {
	class Node {
	    int data;
	    Node next;

	    Node(int data) {
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
	 public void deleteAtPos(int position) {
	        if (head == null) {
	            System.out.println("List is empty!");
	            return;
	        }
	        Node temp = head;
	        if (position == 1) { 
	            if (head.next == head) {
	                head = null;
	                return;
	            }
	            Node last = head;
	            while (last.next != head) {
	                last = last.next;
	            }
	            last.next = head.next;
	            head = head.next;
	            return;
	        }
	        Node prev = null;
	        for (int i = 1; temp.next != head && i < position; i++) {
	            prev = temp;
	            temp = temp.next;
	        }
	        if (temp.next == head && position > 1) {
	            System.out.println("Position exceeds list length!");
	            return;
	        }
	        prev.next = temp.next;
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
			DeletionAtNode ts = new DeletionAtNode();
			ts.add(10);
			ts.add(20);
			ts.add(30);
			ts.add(40);
			ts.add(50);
			ts.add(60);
			ts.deleteAtPos(3);
			ts.display();
		}
}
