package Java.MultiThreading;

class Counter {
    int count = 0;

     void increment() {                                    // Or we can use Synchronized void increment()
         synchronized (this) {
             count++;
         }
     }
}

public class Synchro {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + c.count);  // May not be 2000!
    }
}
