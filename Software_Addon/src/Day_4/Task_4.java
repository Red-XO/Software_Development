package Day_4;
public class Task_4 {
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
	    }
	public void displayF() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void displayT() {
        Node temp = head;
        while (temp != null && temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
	public static void main(String[] args) {
		Task_4 ts = new Task_4();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(5);
		ts.add(6);
		ts.displayF();
		ts.displayT();
	}

}
