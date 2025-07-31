package Java.Strings;

public class FindWordsInString {
    public static void main(String[] args) {
        String s = "Hello World";
        s=s.toLowerCase();
        int count = 0;
     //   String words = s.trim().replaceAll("\\s", "");
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            count++;
        }
        System.out.println(count);
    }
}
