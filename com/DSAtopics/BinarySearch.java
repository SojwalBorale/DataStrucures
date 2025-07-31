package com.DSAtopics;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int i,item,c=0,n,mid=0,beg,end;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the element:");
        n=sc.nextInt();
        int [] arr = new int[n];
        for ( i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the item to find:");
        item = sc.nextInt();
        beg =0;
        end=n-1;
        while (beg<=end){
            mid=(beg+end)/2;
            if (arr[mid]==item){
                c++;
                break;
            } else if (item>arr[mid]) {
                beg=mid+1;
            } else if (item<arr[mid]) {
                end=mid-1;
            }
        }
        if (c>0){
            System.out.print("element is present at :"+mid);
        }
        else {
            System.out.print("element is not present");
        }
    }
}
