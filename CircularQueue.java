public class CircularQueue {
    int size;
    int front,rear;
    int[] queue;
    CircularQueue(int size){
        this.size=size;
        front=-1;
        rear=-1;
        queue = new int[5];
    }
    void enqueue(int data){
        if (front==(rear+1)%size){
            System.out.println("overflow");
            return;
        }
     if (front == -1){
         front= 0;
     }
     rear = (rear+1)%size;
     queue[rear] = data;
    }
    void dequeue(){
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Deleted element: " + queue[front]);

        if (front == rear) { // only one element
            front = rear = -1;
        }
        front = (front+1)%size;
    }
    void display(){
        int i=front;
        for(i=front;i!=rear;i=(i+1)%size){
            System.out.print(queue[i] + " ");
        }
        System.out.print(queue[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue s = new CircularQueue(5);
        s.enqueue(1);
        s.enqueue(2);
        s.enqueue(3);
        s.enqueue(4);
        s.enqueue(5);
        s.display();
        s.dequeue();
        s.display();
        s.enqueue(66);
        s.display();
    }
}
