import java.util.Scanner;

public class Insertionsort {
    public static void main(String[] args) {
        int n, temp, j;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements you want: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Insertion sort
        for (int i = 1; i < n; i++) {
            temp = arr[i];
            j = i - 1;

            // Corrected order of condition
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
