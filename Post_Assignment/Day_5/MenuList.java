package Day_5;

import java.util.Scanner;

import Day_5.DeletionAtNode.Node;

public class MenuList {
	class Node
	{
		int data;
	    Node next;
	    public Node(int data) {
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
	public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            last = newNode;
            last.next = head; 
        } else {
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
		Scanner sc = new Scanner(System.in);
		MenuList ms = new MenuList();
		System.out.println("Circular Linked List Operations");
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
				ms.insert(b);
				break;
			case 2:
				System.out.println("Enter the Number");
				int num = sc.nextInt();
				ms.insert(num);
				break;
			case 3:
				System.out.println("Enter the Position to Delete The Element:");
				int pos = sc.nextInt();
				ms.deleteAtPos(pos);
				break;
			case 4:
				System.out.println("Elements in the List:");
				ms.display();
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
