package Day_4;
public class TraverseDLList {
	class Node {
	    int data;
	    Node prev;
	    Node next;
	 
	    Node(int data) {
	        this.data = data;
	        this.prev = null;
	        this.next = null;
	    }
	}
	 Node head;
	 public void append(int data) {
		 Node newNode = new Node(data);	 
	     if (head == null) {
	    	 head = newNode;
	         return;
	        }
	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newNode;
	        newNode.prev = temp;
	    }
	    public void displayF() {
	        Node temp = head;
	        System.out.print("Forward Traversal: ");
	        while (temp != null) {
	            System.out.print(temp.data + (temp.next != null ? " <-> " : ""));
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	    public void displayB() {
	        Node temp = head;
	        if (temp == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        System.out.print("Backward Traversal: ");
	        while (temp != null) {
	            System.out.print(temp.data + (temp.prev != null ? " <-> " : ""));
	            temp = temp.prev;
	        }
	        System.out.println();
	    }
	    public static void main(String[] args) {
	        TraverseDLList dll = new TraverseDLList();
	        dll.append(10);
	        dll.append(20);
	        dll.append(30);
	        dll.displayF();
	        dll.displayB();
	        }
}
