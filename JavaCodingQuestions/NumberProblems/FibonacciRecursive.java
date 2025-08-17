package JavaCodingQuestions.NumberProblems;

public class FibonacciRecursive {
    public static int recusive(int n){
        if (n==0) return 0;
        if (n==1) return 1;
        return recusive(n-1)+recusive(n-2);
    }
    public static void main(String[] args) {
        int n=9;
        System.out.println("fibonacci series (Recusive): ");
        for (int i=0;i<n;i++){
            System.out.print(recusive(i) + " ");
        }
        System.out.println();
    }
}
