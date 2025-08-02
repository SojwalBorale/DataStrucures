package Java.ExceptioHandling;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try{
            int[] arr = new int[3];
            arr[3]=10;  // it will throw ArrayIndexOutOfBoundException

            int a=10,b=0;
            int result=a/b;  // it will throw ArithmeticException

            String str = null;
            System.out.println(str.length()); //this will throw NullPointerException
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("caught ArrayIndexOutOfBoundException:" + e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("Caught ArithmeticException:"+e.getMessage());
        }catch (NullPointerException e){
            System.out.println("Caught NullPointerException:"+e.getMessage());
        }
        System.out.println("program continues after it handles Exception");
    }
}
