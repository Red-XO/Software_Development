package Day_5;
public class Task_2 {
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
	public void delete() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == last) {
            head = null;
            last = null;
            return;
        }
        head = head.next;
        last.next = head;
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
		Task_2 ts = new Task_2();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		ts.add(60);
		ts.delete();
		ts.display();
	}

}
