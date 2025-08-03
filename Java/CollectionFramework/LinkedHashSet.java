package Java.CollectionFramework;

import java.util.ArrayList;

public class LinkedHashSet {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("sojwal");
        names.add("Akshay");
        names.add("Darshana");
        names.add("Akshay");
        names.add("Darshana");
        names.add("sojwal");

        java.util.LinkedHashSet<String> unique = new java.util.LinkedHashSet<>(names); // convert int LinkedHashSet to remove duplicates and prserve order
        ArrayList<String> removed = new ArrayList<>(unique);  // convert back to arrayList (if needed)
        System.out.println("Unique List with Insertion Order:");
        for(String list : removed){
            System.out.println(list);
        }
    }
}
