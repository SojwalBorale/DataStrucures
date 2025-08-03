package Java.CollectionFramework;
import java.util.ArrayList;
public class ArrayListIterator {
    public static void main(String [] args){
        // create an ArrayList of strings
        ArrayList<Integer> Number = new ArrayList<>();
        Number.add(1);
        Number.add(2);
        Number.add(3);
        Number.add(4);
        System.out.println("the Number in list:");
        for (int n:Number){
            System.out.println(n);
        }
        Number.remove(1);
        System.out.println("the Number After removing from list:");
        for (int n:Number){
            System.out.println(n);
        }
    }
}
