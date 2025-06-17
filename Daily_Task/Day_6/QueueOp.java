package Day_6;
public class QueueOp {
	int size = 5;
    int[] queue = new int[size];
    int front = -1;
    int rear = -1;
    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue is full (Overflow).");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear++;
        queue[rear] = value;
        System.out.println("Enqueued: " + value);
    }
    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty (Underflow).");
            return;
        }

        System.out.println("Dequeued: " + queue[front]);
        front++;
    }
    void display() {
        if (front == -1 || front > rear) {
            System.out.println("The queue is empty.");
            return;
        }
        System.out.print("Current queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueOp q = new QueueOp();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
        q.enqueue(40);
        q.enqueue(50);
        q.display();
    }
}
