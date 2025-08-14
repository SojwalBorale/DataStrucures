package JavaCodingQuestions.Strings;

public class OnlyDigitCheck {
    public static void main(String[] args) {
        String str = "123456";
        boolean onlyDigit = true;
       for (char ch : str.toCharArray()){
           if (!Character.isDigit(ch)){
               onlyDigit = false;
               break;
           }
       }
       if (onlyDigit){
           System.out.println("contains only digit");
       }else {
           System.out.println("sorry contains alphabet");
       }
    }
}
