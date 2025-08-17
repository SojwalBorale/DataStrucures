package JavaCodingQuestions.NumberProblems;


public class FactorialRecursion {
    public static int  factorialRecursion(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * factorialRecursion(n-1);
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println("factorial is: "+ factorialRecursion(num));
    }
}
