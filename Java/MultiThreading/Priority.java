package Java.MultiThreading;

public class Priority extends Thread{
    public Priority(String name){
        super(name);
    }
    public void run(){
        for (int i=1;i<5;i++){
            System.out.println(Thread.currentThread().getName()+ " - priority" + Thread.currentThread().getPriority()+" -count: "+ i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }

    public static void main(String[] args) {
        Priority p = new Priority("Sojwal");
        p.setPriority(Priority.MAX_PRIORITY);
        p.start();
    }
}
