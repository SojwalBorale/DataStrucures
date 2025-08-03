package Java.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetIntoArrayList {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Sojwal");
        names.add("Akshay");
        names.add("Darshana");
        names.add("Samartha");

        ArrayList<String > list = new ArrayList<>(names); // convert set into ArrayList
        Collections.sort(list);  //Sort the ArrayList
        System.out.println("sorted array:");
        for (String item : list){
            System.out.println(item);
        }
    }
}
