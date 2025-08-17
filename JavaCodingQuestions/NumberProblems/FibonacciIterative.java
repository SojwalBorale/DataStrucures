package JavaCodingQuestions.NumberProblems;

public class FibonacciIterative {
    public static void fibonacci(int n){
        int first = 0, second =1;
        for (int i=0;i<n;i++){
            System.out.print(first+" ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        fibonacci(5);
    }
}
