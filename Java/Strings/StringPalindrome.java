package Java.Strings;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "madam";
        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();
        if (s.equals(s1.toString())){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not palindrome");
        }

    }
}
