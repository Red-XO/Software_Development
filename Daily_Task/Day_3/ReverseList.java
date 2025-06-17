package Day_3;
public class ReverseList {
	Node head;
    class Node
    {
        int data;
        Node next;
        Node(int num)
        {
            data=num;
        } 
    }
    public void insertData(int num)
    {
        Node newNode=new Node(num);
        if (head==null) 
        {
            head=newNode;
            newNode.next=null;
        }
        else
        {     
            newNode.next=head;
            head=newNode;
        }
    }
	public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;  
            current.next = prev;  
            prev = current;       
            current = next;
        }
        head = prev;
    }
	 public void display()
	    {
	        Node temp=head;
	        while (temp!=null)
	        {
	            System.out.print(temp.data+"->");
	            temp=temp.next;
	        }
	       System.out.println("null");
	    }
	public static void main(String[] args) {
		ReverseList rs = new ReverseList();
		rs.insertData(3);
		rs.insertData(23);
		rs.insertData(12);
		rs.insertData(5);
		rs.insertData(8);
		rs.insertData(6);
		rs.insertData(4);
		rs.insertData(9);
		rs.insertData(7);
		rs.reverse();
		rs.display();
	}
}
