package JavaCodingQuestions.NumberProblems;

public class CheckNumberIsPrime {
    public static void main(String[] args) {
        int num = 29;
        System.out.println(Math.sqrt(num));
        if (isPrime(num)){
            System.out.println("the number is prime");
        }else {
            System.out.println("the number is not prime");
        }

    }
    public static boolean isPrime(int num){
        if (num == 2) return true;
        if (num <=1) return false;
        if (num % 2 == 0) return false;

        for (int i=3;i<Math.sqrt(num);i+=2){
            if (num %i == 0) return false;
        }
        return true;
    }
}
