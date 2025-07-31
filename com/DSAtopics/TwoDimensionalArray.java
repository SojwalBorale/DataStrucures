package com.DSAtopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray{
    static int rows=3;
    static int cols = 3;
    static int [][] arr = new int[rows][cols];

    static void traverse(){
        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static boolean isValid(int row, int col) {
        if (row >= 0 && row < rows && col >= 0 && col < cols)
            return true;
        else
            return false;
    }
    static void insert(int row,int col, int value){
        if(isValid(row,col)){
            arr[row][col]=value;
            System.out.println("Inserted"+value+"at"+row+"and"+col);
        }
    }
    static void get(int row,int col){
        if (isValid(row,col)){
            System.out.println("the no. is:"+arr[row][col]);
        }
    }
    static void set(int row,int col,int value){
        if(isValid(row, col)){
            arr[row][col] = value;
            System.out.println("the value added is:"+value);
        }
    }
    static void delete(int row, int col){
        if (isValid(row,col)){
            arr[row][col] = 0;
            System.out.println("deleted element"+arr[row][col]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        traverse();
        insert(0,0,20);
        insert(1,1,45);
        insert(2,2,56);
        traverse();
        delete(0,0);
        traverse();
        get(1,1);
        set(0,0,60);
        traverse();

    }
}
