package com.DSAtopics;

import java.util.Scanner;
public class Selectionsort {
    public static void main(String[] args) {
        int n,temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. of elements you want:");
        n=sc.nextInt();
        int [] a = new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n-1;i++){
            int loc=i;
            for (int j=i+1;j<n;j++){
                if(a[j]<a[loc]){
                    loc=j;
                }
                temp=a[i];
                a[i]=a[loc];
                a[loc]=temp;
            }
        }
      for (int i=0;i<n;i++){
          System.out.print(a[i]+ " ");
      }
    }
}
