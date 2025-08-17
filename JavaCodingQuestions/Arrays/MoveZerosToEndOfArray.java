package JavaCodingQuestions.Arrays;

import java.util.Arrays;

public class MoveZerosToEndOfArray {
    public static void main(String[] args) {
        int arr [] = {4,0,3,12,0,0,5,0,7,9};
        int end = arr.length-1;
        for (int i=0;i< arr.length;i++){
            while(arr[i]==0 && i <= end){
                int temp = arr[end];
                arr[end] =arr[i];
                arr[i] = temp;
                end--;
                if(i==end)break;
            }

//            int start = arr[i];
//            int end = arr.length-1;
//            int temp;
//            if (arr[i]!=0){
//                continue;
//            }
//            else {
//                temp =start;
//                start = end;
//                end = temp;
//            }
//            System.out.println(Arrays.toString(arr));
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

}
