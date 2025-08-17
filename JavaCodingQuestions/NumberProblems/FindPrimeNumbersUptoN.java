package JavaCodingQuestions.NumberProblems;

public class FindPrimeNumbersUptoN {
    public static void main(String[] args) {
        int num = 29;
        System.out.println(Math.sqrt(num));
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
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

