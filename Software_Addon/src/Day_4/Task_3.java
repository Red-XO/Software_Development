package Day_4;
public class Task_3 {
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
		 Task_3 ts = new Task_3();
			ts.add(1);
			ts.add(2);
			ts.add(3);
			ts.add(4);
			ts.add(5);
			ts.add(6);
			ts.delete(3);
			ts.delete(4);
			ts.display();	
	}

}
