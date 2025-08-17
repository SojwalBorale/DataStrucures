package JavaCodingQuestions.NumberProblems;

public class CheckNumberIsPalindrome {
    public static void main(String[] args) {
     int num =151;
     int originalNum = num;
     int reveresedNum = 0;
     while (num != 0){
         int digit = num % 10;
         reveresedNum =  reveresedNum *10 + digit;
         num /= 10;
     }
     if (originalNum == reveresedNum){
         System.out.println("yes it is palindrome");
     }else{
         System.out.println("sorry not palindrome");
     }
    }
}
