package Day_3;
import java.util.Scanner;
public class Task_5 {
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
	public void printList() {
		Node temp = head;
	    while (temp != null) {
	    	System.out.print(temp.data + " -> ");
	        temp = temp.next;
	        }
	    System.out.println("null");
	    }
	public void insertAtPosition(int data, int position) {
	    if (position < 0) {
	        System.out.println("Invalid position!");
	        return;
	    }
	    Node newNode = new Node(data);
	    if (position == 0) { // Insert at beginning
	        newNode.next = head;
	        head = newNode;
	        return;
	    }
	    Node temp = head;
	    int index = 0;
	    while (temp != null && index < position - 1) {
	        temp = temp.next;
	        index++;
	    }
	    if (temp == null) {
	        System.out.println("Position out of bounds!");
	        return;
	    }
	    newNode.next = temp.next;
	    temp.next = newNode;
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
	public static void main(String[] args) {
	Task_5 ts =	new Task_5();
	Scanner sc = new Scanner(System.in);
	System.out.println("1.Add Element");
	System.out.println("2.Insert Element");
	System.out.println("3.Delete Element");
	System.out.println("4.Display List");
	System.out.println("5.Exit");
	while(true) {
		System.out.println("Enter Your Choice:");
		int a = sc.nextInt();
		switch(a){
			case 1:
				System.out.println("Enter the number:");
				int b = sc.nextInt();
				ts.add(b);
				break;
			case 2:
				System.out.println("Enter the Number");
				int c = sc.nextInt();
				System.out.println("Enter the Position");
				int d = sc.nextInt();
				ts.insertAtPosition(c, d);
				break;
			case 3:
				System.out.println("Enter the Position");
				int e = sc.nextInt();
				ts.deleteAtPosition(e);
				break;
			case 4:
				ts.printList();
				break;
			case 5:
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
	}
}
}
