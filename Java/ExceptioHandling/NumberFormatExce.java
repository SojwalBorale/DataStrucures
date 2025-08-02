package Java.ExceptioHandling;

import java.util.Scanner;

public class NumberFormatExce {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the input:");
           String input = sc.nextLine();
            try {
                int number = Integer.parseInt(input); // try to convert into String
                System.out.println("your entered number is:"+number);
            }
            catch (NumberFormatException e){
                System.out.println("Inavalid input! please enter only integer");
            }

        }
    }

