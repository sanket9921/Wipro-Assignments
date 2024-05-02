//a) Write a recursive function named SumArray that calculates and
// returns the sum of elements in an array, demonstarte with example.

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SumArray {

    public static int sumArray(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + sumArray(arr, index + 1);
    }

    public static void main(String[] args) {
        // Example array
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Element into array");
        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        int sum = sumArray(arr, 0);
        System.out.println("Sum of elements in the array: " + sum);
    }
}
