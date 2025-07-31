package com.DSAtopics;

public class Queue {
        int front=-1;
        int rear=-1;
        int n=10;
        int[]queue = new int[n];


        public void enqueue(int data){
            if (rear==(n-1)){
                System.out.println("queue is full ");
            }
            else{
                if (front==-1 && rear==-1){
                    front=0;
                    rear=0;
                    queue[rear]= data;
                }
                else {
                    rear = rear + 1;
                    queue[rear] = data;
                }
            }
        }
        public void dequeue(){
            if(front==-1 && rear==-1){
                System.out.println("empty queue");
            }
            front = front+1;
        }
        public void display(){
            for (int i=front;i<rear;i++){
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
        public void peek(){
            System.out.println("the peek element is:"+queue[front]);
        }

        public static void main(String[] args) {
            Queue s = new Queue();
            s.enqueue(10);
            s.enqueue(20);
            s.enqueue(30);
            s.enqueue(40);
            s.enqueue(50);
            s.enqueue(60);
            s.enqueue(70);
            s.enqueue(80);
            s.enqueue(90);
            s.enqueue(100);
            s.display();
            s.dequeue();
            s.dequeue();
            s.display();
            s.peek();
        }
    }
