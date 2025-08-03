package Java.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class SortingAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> i =new ArrayList<>();
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(4);
        i.add(5);
        Collections.sort(i);
        System.out.println("sorted:");
        for (int j:i){
            System.out.println(j);
        }
        Collections.sort(i,Collections.reverseOrder());
        System.out.println("sorted in reverse order:");
        for (int k:i){
            System.out.println(k);
        }
    }
}
