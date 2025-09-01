package JavaCodingQuestions.CollectionsAndMapProblems;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWordsUsingHashMap {
    public static void main(String[] args) {
        String str = "java is fun and java is powerful";
        // split the string into words
        String[] words = str.split("\\s+");
        // now create a hashmap to store the word frequencies
        HashMap<String,Integer> wordCount = new HashMap<>();

        for (String word : words){
            // convert to lowercase for case-insesitivity
            word = word.toLowerCase();

            // update the frequency in hashmap
            wordCount.put(word,wordCount.getOrDefault(word,0)+1);
        }
        // print word frequencies
        for (Map.Entry<String,Integer> entry : wordCount.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}
