package Day_4;

import java.util.Scanner;

public class Task_5 {
	 Node head;
	 public void add(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        newNode.next = head;
	        head.prev = newNode;
	        head = newNode;
	 }   public void insert(int data, int position) {
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
	    // Delete from a specific position
	    public void delete(int position) {
	        if (head == null) return;
	        Node temp = head;
	        for (int i = 0; i < position && temp != null; i++) {
	            temp = temp.next;
	        }
	        if (temp == null) return;
	        if (temp.prev != null) temp.prev.next = temp.next;
	        if (temp.next != null) temp.next.prev = temp.prev;
	    }
	    // Traverse from front to tail
	    public void display() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Task_5 ts = new Task_5();
	System.out.println("1.Add Element");
	System.out.println("2.Insert Element");
	System.out.println("3.Delete Element");
	System.out.println("4.Display List");
	System.out.println("5.Exit");
	System.out.println("Enter Your Choice:");
	int a = sc.nextInt();
	switch(a) {
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
		ts.insert(c, d);
		break;
	case 3:
		System.out.println("Enter the Position");
		int e = sc.nextInt();
		ts.delete(e);
		break;
	case 4:
		ts.display();
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
