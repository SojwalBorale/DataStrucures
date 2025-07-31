package Java.Strings;

public class VowelsConsonant {
    public static void main(String[] args) {
        String s = "Hello world";
        s=s.toLowerCase();
        int vowels=0,consonant=0;
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z'){
                if (c=='a' ||c=='e'||c=='i'||c=='o'||c=='u'){
                    vowels++;
                }
                else {
                    consonant++;
                }
            }
        }
        System.out.println("Vowels:"+vowels);
        System.out.println("consonants:"+consonant);
    }
}
