package Day_6;
import java.util.Arrays;
import java.util.Scanner;
public class Task_3 {
	int arr[] = new int[5];
	int rear;
	int front;
	public void queue() {
		rear=-1;
		front=-1;
	}
	public void en_queue(int num) {
		if(rear==4) {
			System.out.println("Queue Spreadout");
		}
		else {
			arr[++rear]=num;
		}
	}
	public void de_queue() {
		if(front==4) {
			System.out.println("Empty Queue");
		}
		else {
			arr[++front]=0;
		}
	}
	public void display() {
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Task_3 ts = new Task_3();
		ts.en_queue(4);
		ts.en_queue(5);
		ts.en_queue(8);
		ts.de_queue();
		ts.en_queue(7);
		ts.display();
		sc.close();
	}
}
