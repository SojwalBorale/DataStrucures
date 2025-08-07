package Java.MultiThreading.ThreadMethods;

public class InterruptExample extends Thread {
    public void run() {
        try {
            System.out.println("thread is sleeping...");
            Thread.sleep(5000);
            System.out.println("Thread woke up.");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted while sleeping.");
        }
    }

    public static void main(String[] args) {
        InterruptExample s = new InterruptExample();
        s.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
            s.interrupt();   // interrupt the thread while it sleeps
        }
    }

