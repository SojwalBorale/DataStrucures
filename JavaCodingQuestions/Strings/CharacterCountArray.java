package JavaCodingQuestions.Strings;

public class CharacterCountArray {
    public static void main(String[] args) {
        String str = "programming";
        countCharacters(str);
    }
    public static void countCharacters(String s){
        int [] freq = new int[256]; //ASCII size

        // count each character
        for (int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        //print characters with frequency > 0
        for (int i=0;i< freq.length;i++){
            if (freq[i] > 0){
                System.out.println((char) i + " : "+ freq[i]);
            }
        }
    }
}
