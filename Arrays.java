import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Scanner;

public class Arrays{
   static int size = 0;
   static int [] arr = new int[100];

   static void traverse(){
       System.out.println("array elements:");
       for (int i=0;i<size;i++){
           System.out.print(arr[i] + " ");
       }
       System.out.println();
   }
   static void insertion(int pos, int value){
       if (pos<0 || pos>size){
           System.out.println("Invalid");
           return;
       }
       for (int i=size;i>pos;i--){
           arr[i] = arr[i-1];
       }
       arr[pos] = value;
       size++;
   }
    static void deletion(int pos){
        if (pos<0 || pos>size){
            System.out.println("Invalid");
            return;
        }
        for (int i=pos;i<size-1;i++){
            arr[i] = arr[i+1];
        }
        size--;
    }
    static void get(int pos){
       if (pos<0 || pos>size){
           System.out.println("Invalid");
           return;
       }
        System.out.println("the value is:"+ arr[pos]);
    }

    static void set(int pos, int value){
       if (pos<0 || pos>size){
           System.out.println("Invalid");
           return;
       }
       arr[pos] = value;
       System.out.println("the value to be set is:" + arr[pos]);
    }


   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the size of array:");
       size = sc.nextInt();
       System.out.println("the array:");
       for (int i =0;i<size;i++){
           arr[i]=sc.nextInt();
       }
       traverse();
       insertion(2,54);
       traverse();
       deletion(2);
       traverse();
       get(1);
       set(0,99);
       traverse();

   }
}
