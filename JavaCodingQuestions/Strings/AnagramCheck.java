package JavaCodingQuestions.Strings;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        // remove spaces and convert to lowercase
        s1 = s1.replaceAll("\\s","").toLowerCase();
        s2 = s2.replaceAll("\\s","").toLowerCase();

        if (s1.length()!= s2.length()){
            System.out.println("Not anagrams");
            return;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // compare sorted array
        if (Arrays.equals(arr1,arr2)){
            System.out.println("yes it is anagram");
        }else {
            System.out.println("not anagram");
        }
    }
}
