package Day_3;
import java.util.Scanner;
public class SinglyLinkedList {
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
	    public void deleteAtPosition(int position)
	    {
	        if (head == null)
	        {
	            System.out.println("List is empty. Nothing to delete.");
	        }
	        if (position < 1)
	        {
	            System.out.println("Invalid position. Position should be >= 1.");
	        }
	        if (position == 1)
	        {
	            head = head.next;
	        }
	        Node current = head;
	        int count = 1;
	        while (current != null && count < position - 1)
	        {
	            current = current.next;
	            count++;
	        }
	        if (current == null || current.next == null)
	        {
	            System.out.println("Position is greater than the length of the list.");
	        }
	        current.next = current.next.next;
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
			Scanner sc = new Scanner(System.in);
			SinglyLinkedList slc = new SinglyLinkedList();
			System.out.println("Singly Linked List Operations");
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
					slc.insertData(b);
					break;
				case 2:
					System.out.println("Enter the Position and Number");
					int p = sc.nextInt();
					int num = sc.nextInt();
					slc.insert(num, p);
					break;
				case 3:
					System.out.println("Enter the Position to Delete The Element:");
					int del = sc.nextInt();
					slc.deleteAtPosition(del);
					break;
				case 4:
					System.out.println("Elements in the List:");
					slc.display();
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
