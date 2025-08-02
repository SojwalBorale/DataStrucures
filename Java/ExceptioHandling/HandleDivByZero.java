package Java.ExceptioHandling;

public class HandleDivByZero {
    public static void main(String[] args) {

        try {
            int a=10/0;
            System.out.println(a);
        }
        catch (ArithmeticException e){
            System.out.println("Oops! Exception occured");
        }
    }
}
