package Day_3;
public class DeletePosition {
	Node head;
    class Node
    {
        int data;
        Node next;
        Node(int num)
        {
            data=num;
            next=null;
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
    public void deleteAtPosition(int position)
    {
        if (head == null)
        {
            System.out.println("List is empty. Nothing to delete.");
        }
        if (position < 1)
        {
            System.out.println("Invalid position. Position should be >= 1.");
        }
        if (position == 1)
        {
            head = head.next;
        }
        Node current = head;
        int count = 1;
        while (current != null && count < position - 1)
        {
            current = current.next;
            count++;
        }
        if (current == null || current.next == null)
        {
            System.out.println("Position is greater than the length of the list.");
        }
        current.next = current.next.next;
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
		DeletePosition ds = new DeletePosition();
		ds.insertData(23);
		ds.insertData(24);
		ds.insertData(25);
		ds.insertData(26);
		ds.insertData(27);
		ds.insertData(28);
		ds.insertData(29);
		ds.insertData(30);
		ds.insertData(32);
		ds.deleteAtPosition(3);
		ds.deleteAtPosition(4);
		ds.display();
	}
}
