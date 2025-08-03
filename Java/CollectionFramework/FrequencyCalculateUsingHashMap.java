package Java.CollectionFramework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCalculateUsingHashMap {
    public static void main(String[] args) {
        String [] fruits = {"banana","apple","mango"};  // Array of multiple strings
        HashMap<Character,Integer> map = new HashMap<>();  // Create a hashMap to store character frequencies

        //loop through each word and count characters
        for (String fruit : fruits){
            for (char ch: fruit.toCharArray()){
                if (Character.isLetter(ch)){
                    map.put(ch, map.getOrDefault(ch,0)+1);
                }
            }
        }
        // Print frequencies result
        System.out.println("Alphabet frequencies are:");
        for (Map.Entry<Character,Integer> entry : map.entrySet()){

            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
