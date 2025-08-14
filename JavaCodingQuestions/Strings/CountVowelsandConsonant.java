package JavaCodingQuestions.Strings;

public class CountVowelsandConsonant {
    public static void main(String[] args) {

        String str = "HEllO WORld";
        str = str.toLowerCase();

        int vowels=0,consonant=0;
        for (char c: str.toCharArray()){
            if (c>='a' && c<='z'){
                if (c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'){
                    vowels++;
                }else {
                    consonant++;
                }
            }
        }
        System.out.println("vowels are: "+vowels);
        System.out.println("consonants are: "+consonant);
    }
}
