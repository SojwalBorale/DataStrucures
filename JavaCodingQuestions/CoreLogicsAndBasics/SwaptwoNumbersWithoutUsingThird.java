package JavaCodingQuestions.CoreLogicsAndBasics;

public class SwaptwoNumbersWithoutUsingThird {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        a = a + b;   // a becomes 30
        b = a - b;   // b becomes 20
        a = a - b;   // a becomes 10

        System.out.println("a value: "+a);
        System.out.println("a value: "+b);
    }
}
