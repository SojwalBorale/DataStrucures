package JavaCodingQuestions.CollectionsAndMapProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,20,10,30,40,30,40));
        System.out.println("original list:" + list);

        // remove duplicates
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        System.out.println("removed duplicates: "+ set);
    }
}
