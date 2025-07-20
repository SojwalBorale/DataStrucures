import java.util.Scanner;

public class Quicksort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Perform Quick Sort
        quickSort(arr, 0, n - 1);

        // Output sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Quick Sort function
    static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pi = partition(arr, start, end); // partition index
            quickSort(arr, start, pi - 1); // sort left
            quickSort(arr, pi + 1, end); // sort right
        }
    }

    // Partition function
    static int partition(int[] arr, int start, int end) {
        int pivot = arr[end]; // last element as pivot
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot with element at i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[start] = temp;

        return i + 1; // Return partition index
    }
}
