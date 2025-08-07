package Java.MultiThreading.ThreadMethods;

class MyThread extends Thread {
    public void run() {
        try {
            Thread.sleep(2000); // simulate some work
            System.out.println("Thread finished");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class IsAliveExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        System.out.println("Before starting thread: " + t1.isAlive()); // false

        t1.start();

        System.out.println("After starting thread: " + t1.isAlive()); // true

        try {
            t1.join(); // wait for t1 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("After thread has finished: " + t1.isAlive()); // false
    }
}
