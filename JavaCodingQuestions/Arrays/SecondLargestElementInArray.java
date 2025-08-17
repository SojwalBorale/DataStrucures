package JavaCodingQuestions.Arrays;

import java.util.Arrays;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int arr [] = {12,35,1,10,34,1};
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
//        for (int i=0;i< arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
        System.out.println(Arrays.toString(arr));
        System.out.println("second largest element is: "+arr[arr.length-2]);

    }
}
