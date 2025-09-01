package JavaCodingQuestions.CollectionsAndMapProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstnNonRepeatingElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,5,1,2,0,4,5,1,2);
        //count frequwncy using hashmap
        Map<Integer,Integer> freqMap = new HashMap<>();
        for (int num : numbers){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }
        // find first element with frequency = 1
        Integer firstNonRepeating = null;
        for (int num : numbers){
            if (freqMap.get(num)==1){
                firstNonRepeating=num;
                break;
            }
        }
        if (firstNonRepeating!=null){
            System.out.println("first repeating element is: "+firstNonRepeating);
        }
        else {
            System.out.println("no non repeating element");
        }
    }
}
