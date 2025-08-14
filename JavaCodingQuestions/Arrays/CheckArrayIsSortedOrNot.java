package JavaCodingQuestions.Arrays;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        int arr [] = {6,4,5,3,2,1};
        if (isSorted(arr)){
            System.out.println("Array is sorted");
        }else {
            System.out.println("Array is unsorted");
        }
    }
    public static boolean isSorted(int [] arr){
        boolean asc = true, desc = true;
        for (int i=0;i< arr.length-1;i++) {
            if (arr[i] > arr[i + 1]) asc = false;
            if (arr[i] < arr[i + 1]) desc = false;
        }
        return asc||desc;
        }
    }

