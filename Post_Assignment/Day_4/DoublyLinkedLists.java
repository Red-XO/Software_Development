package Day_4;
import java.util.Scanner;
public class DoublyLinkedLists {
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
	    public void deleteAtMiddle() {
			int length = getLength();
		    if (length == 0) {
		    	System.out.println("List is empty.");
		        return;
		        }
		    	int mid = length / 2;
		        Node temp = head;
		        for (int i = 0; i < mid; i++) {
		            temp = temp.next;
		        }
		        if (temp.prev == null) {
		            head = temp.next;
		            if (head != null) head.prev = null;
		        }
		        else {
		            temp.prev.next = temp.next;
		            if (temp.next != null) {
		                temp.next.prev = temp.prev;
		            }
		        }
		        System.out.println("Deleted node with value: " + temp.data);
		    }
	    public void traverse() {
	        Node temp = head;
	        System.out.print("Traversing from Front: ");
	        while (temp != null) {
	            System.out.print(temp.data + (temp.next != null ? " <-> " : ""));
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	    public static void main(String[] args) {
			DoublyLinkedLists ls = new DoublyLinkedLists();
			Scanner sc = new Scanner(System.in);
			System.out.println("Doubly Linked List Operations");
			System.out.println("1.Add Element");
			System.out.println("2.Insert Element");
			System.out.println("3.Delete Element");
			System.out.println("4.Display");
			System.out.println("5.Exit");
			while(true) {
				System.out.println("Enter Your Choice:");
				int a= sc.nextInt();
				switch(a) {
				case 1:
					System.out.println("Enter the Number:");
					int b = sc.nextInt();
					ls.append(b);
					break;
				case 2:
					System.out.println("Enter the Number");
					int num = sc.nextInt();
					ls.insertAtMiddle(num);
					break;
				case 3:
					System.out.println("Enter the Position to Delete The Element:");
					ls.deleteAtMiddle();
					break;
				case 4:
					System.out.println("Elements in the List:");
					ls.traverse();
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice:");
					break;
				}
			}
		}
}
