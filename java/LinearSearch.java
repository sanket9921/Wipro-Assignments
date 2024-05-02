//b) Write a function named PerformLinearSearch that searches for a
// specific element in an array and returns the index of the element if found or -1 if not found.

import java.util.Scanner;

public class LinearSearch {

    public static int performLinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element into array");
        for (int i=0;i<size;i++){
            arr[i] = scan.nextInt();;
        }
        System.out.println("Enter the target to be search");
        int target = scan.nextInt();
        int index = performLinearSearch(arr, target);
        if (index != -1) {
            System.out.println("Element found at index: " + index); // Output: Element found at index: 4
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
