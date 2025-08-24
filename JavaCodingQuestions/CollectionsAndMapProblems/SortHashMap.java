package JavaCodingQuestions.CollectionsAndMapProblems;

import java.util.*;

public class SortHashMap {
    public static void main(String[] args) {
        // create hashmap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 50);
        map.put("Banana", 10);
        map.put("Mango", 30);
        map.put("Orange", 20);
        map.put("Grapes", 40);

        System.out.println("original Hashmap: "+ map);
        // convert hashmap into list
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        //sort bu values
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        LinkedHashMap<String,Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list){
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println("HashMap sorted values: "+sortedMap);
    }
}
