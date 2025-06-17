package Day_6;
class Node{
	int data;
	Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
		}
}
public class StackInList{
	Node head;
	public void push(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node temp = head;			
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
	}
	public void pop() {
		Node temp=head;
		if(temp ==null||temp.next==null) {
			System.out.println("Position out of bounds");
		}
		while (temp.next.next != null) {
	        temp = temp.next;
	    }
	    temp.next = null;
	}
	public void display() {
		Node temp =head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		Task_1 ts = new Task_1();
		ts.push(5);
		ts.push(7);
		ts.push(40);
		ts.push(9);
		ts.pop();
		ts.display();
	}
}
