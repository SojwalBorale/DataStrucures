class Fork {
    int data;
    Fork next;

    Fork(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueLL {
    Fork front, rear;

    public QueueLL() {
        front = rear = null;
    }

    // Enqueue operation - add element to rear
    void enqueue(int data) {
        Fork newNode = new Fork(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue operation - remove element from front
    int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return -1;
        }

        int val = front.data;
        front = front.next;

        if (front == null)
            rear = null;

        return val;
    }

    // Peek - get front element without removing
    int peek() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return front.data;
    }

    // Check if queue is empty
    boolean isEmpty() {
        return front == null;
    }

    // Display the queue
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        Fork temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        QueueLL q = new QueueLL();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        q.display();

        System.out.println("Front element: " + q.peek());
    }
}
