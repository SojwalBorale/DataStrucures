package JavaCodingQuestions.NumberPatterns;

import java.util.Scanner;

public class PyramidOfNumbers {
    public static void main(String[] args) {
        int rows = 5; // You can change this to any number of rows
        int num = 1;

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  "); // Two spaces for better alignment
            }

            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "   "); // Extra space for pyramid shape
                num++;
            }

            System.out.println();
        }
    }
}


