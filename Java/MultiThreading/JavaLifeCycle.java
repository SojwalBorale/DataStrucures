package Java.MultiThreading;

import java.sql.SQLOutput;

public class JavaLifeCycle extends Thread {
    public void run(){
        System.out.println("Running state");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
  JavaLifeCycle j1 = new JavaLifeCycle();
        System.out.println(j1.getState());        // these both is exEcuted by Main
        j1.start();
        System.out.println(j1.getState());        // returns runnable                       //State values 1.NEW
        System.out.println(Thread.currentThread().getState());                               // 2.RUNNABLE
        Thread.sleep(100);                                                           // 3.BLOCKED
        System.out.println(j1.getState());                                                  // 4.WAITING
        j1.join();                                                                          // 5.TIMED WAITING
        System.out.println(j1.getState());                                                   // 6.TERMINATED


    }
}
