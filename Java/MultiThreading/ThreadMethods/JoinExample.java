package Java.MultiThreading.ThreadMethods;

class ApnaThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        ApnaThread t = new ApnaThread();
        t.start();

        // Main thread waits for child to finish
        t.join();

        System.out.println("Main Thread continues after child completes.");
    }
}


