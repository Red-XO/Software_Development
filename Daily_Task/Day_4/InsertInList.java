package Day_4;
public class InsertInList {
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
	    public int getLength() {
	        int count = 0;
	        Node temp = head;
	        while (temp != null) {
	            count++;
	            temp = temp.next;
	        }
	        return count;
	    }
	    public void insertAtMiddle(int data) {
	        int length = getLength();
	        int mid = length / 2;
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node temp = head;
	        for (int i = 0; i < mid - 1; i++) {
	            temp = temp.next;
	        }
	        newNode.next = temp.next;
	        if (temp.next != null) {
	            temp.next.prev = newNode;
	        }
	        temp.next = newNode;
	        newNode.prev = temp;
	    }
	    public void displayForward() {
	        Node temp = head;
	        System.out.print("Traversing: ");
	        while (temp != null) {
	            System.out.print(temp.data + (temp.next != null ? " <-> " : ""));
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	    public static void main(String[] args) {
	        InsertInList dll = new InsertInList();
	        dll.append(10);
	        dll.append(20);
	        dll.append(30);
	        dll.append(40);
	        dll.insertAtMiddle(99);
	        dll.displayForward(); 
	    }
}
