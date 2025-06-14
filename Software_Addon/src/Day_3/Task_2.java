package Day_3;
	class Insertion{
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
		public void insert(int data,int pos) {
			Node newNode = new Node(data);
			if (pos == 1) { 
				newNode.next = head;
		        head = newNode;
		        return;
			}
			Node temp = head;
			for (int i = 1;temp != null && i<pos-1; i++) {
				temp = temp.next;
			}
			if (temp == null) {
				System.out.println("Position out of bounds!");
		        return;
			}
			newNode.next = temp.next;
		    temp.next = newNode;
		}
		public void display() {
			Node temp = head;
			while(temp != null){
				System.out.print(temp.data + " -> ");
		        temp = temp.next;	
			}
			System.out.print("null");
		}
	}

public class Task_2 {
public static void main(String args[]) {
	Insertion ins = new Insertion();
	ins.add(10);
	ins.add(20);
	ins.add(30);
	ins.add(40);
	ins.add(50);
	ins.add(60);
	ins.insert(12, 1);
	ins.insert(24, 2);
	ins.display();
}
}
