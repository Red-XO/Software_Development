package Day_3;
class Node {
		int data;
	    Node next;
	    Node prev;
	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	        this.prev = null;
	    }
	}
	class SinglyLinkedList {
		Node head;
		 public void add(int data) {
		        Node newNode = new Node(data);
		        if (head == null) {
		            head = newNode;
		        } else {
		            Node temp = head;
		            while (temp.next != null) {
		                temp = temp.next;
		            }
		            temp.next = newNode;
		        }
		 }
		 public void traverse() {
		        Node temp = head;
		        while (temp != null) {
		            System.out.print(temp.data + " -> ");
		            temp = temp.next;
		        }
		        System.out.println("null");
		 }
	}
	public class Task_1 {
	 public static void main(String[] args) {
	        SinglyLinkedList list = new SinglyLinkedList();
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.traverse(); 
	        }
	}