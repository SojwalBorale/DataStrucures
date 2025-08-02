package Java.ExceptioHandling;

import java.util.Scanner;

public class ArrayHandler {
    public int getElements(int [] arr, int index){
        try {
            return arr[index];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error invalid Index:" + index);
            return 0;
        }
    }

    public static void main(String[] args) {
        ArrayHandler handle = new ArrayHandler();
        int [] array = {10,20,30,40,50};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter index:");
        int indexing = sc.nextInt();
        System.out.println("Element at index"+indexing+":"+handle.getElements(array,indexing));
    }
}
