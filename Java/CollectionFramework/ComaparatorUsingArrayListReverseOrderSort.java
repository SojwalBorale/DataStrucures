package Java.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComaparatorUsingArrayListReverseOrderSort {
    public static void main(String[] args) {
        // Array lsit integer type
        ArrayList<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);

        // Sort using comparator
        Collections.sort(s, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        // print
        System.out.println("sorted in reverse order: "+s);
    }
}
