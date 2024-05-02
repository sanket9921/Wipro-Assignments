//a) Implement a function called BruteForceSort that sorts an array using
// the brute force approach. Use this function to sort an array created with InitializeArray.

import java.util.Scanner;

public class BruteForceSort {

    public static void bruteForceSort(int[] arr) {
        int n = arr.length;
        for (int pass = 0; pass < n - 1; pass++) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element into the array");
        for (int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        bruteForceSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
