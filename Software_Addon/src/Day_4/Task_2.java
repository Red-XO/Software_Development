package Day_4;
public class Task_2 {
	Node head;
	 // Method to add a node at the beginning
	    public void addFirst(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        newNode.next = head;
	        head.prev = newNode;
	        head = newNode;
	    }
	    // Insert at a specific position
	    public void insertAtMiddle(int data, int position) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node temp = head;
	        for (int i = 0; i < position - 1 && temp.next != null; i++) {
	            temp = temp.next;
	        }
	        newNode.next = temp.next;
	        newNode.prev = temp;
	        if (temp.next != null) {
	            temp.next.prev = newNode;
	        }
	        temp.next = newNode;
	    }
	    // Traverse from front to tail
	    public void traverseFront() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	public static void main(String[] args) {
		   Task_2 ts = new Task_2(); 
	        ts.insertAtMiddle(10, 0);
	        ts.insertAtMiddle(20, 1);
	        ts.insertAtMiddle(30, 2);
	        ts.insertAtMiddle(25, 2); // Insert at middle
	        System.out.println("Forward Traversal:");
	        ts.traverseFront();
	}

}
