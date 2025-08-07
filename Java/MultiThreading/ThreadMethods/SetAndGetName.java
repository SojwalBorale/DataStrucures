package Java.MultiThreading.ThreadMethods;

public class SetAndGetName {

        public static void main(String[] args) {
            Thread t1 = new Thread(() -> System.out.println("Current thread: " + Thread.currentThread().getName()));
            Thread t2 = new Thread(() -> System.out.println("Current thread: " + Thread.currentThread().getName()));

            System.out.println("Before setting names:");
            System.out.println("t1 name: " + t1.getName()); // usually "Thread-0"
            System.out.println("t2 name: " + t2.getName()); // usually "Thread-1"

            t1.setName("Downloader");
            t2.setName("Uploader");

            t1.start();
            t2.start();
        }
    }


