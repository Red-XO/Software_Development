package Day_4;
class Node{
	int data;
	Node prev;
	Node next;
	public Node(int data) {
		this.data=data;
		this.prev=null;
		this.next=null;
}	
}
public class Task_1 {
Node head;
//Method to add a node at the beginning
public void add(int data) {
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
        return;
    }
    newNode.next = head;
    head.prev = newNode;
    head = newNode;
}
public void display() {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println();
}
public static void main(String[] args) {
	Task_1 ts = new Task_1();
	ts.add(1);
	ts.add(2);
	ts.add(3);
	ts.add(4);
	ts.add(5);
	ts.add(6);
	ts.display();
}
}
