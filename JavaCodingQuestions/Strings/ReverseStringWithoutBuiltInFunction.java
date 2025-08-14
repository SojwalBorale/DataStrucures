package JavaCodingQuestions.Strings;

public class ReverseStringWithoutBuiltInFunction {
    public static void main(String[] args) {
        String original = "Helloworld";
        String reverse = "";
        for (int i=original.length()-1;i>=0;i--){
            reverse += original.charAt(i);
        }
        System.out.println(original);
        System.out.println(reverse);
    }
}
