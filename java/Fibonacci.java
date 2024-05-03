
//b) Create a recursive function to find the nth element of a Fibonacci
// sequence and store the first n elements in an array.

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int[] fibonacciArray(int n) {
        int[] fibonacciArray = new int[n];
        for (int i = 0; i < n; i++) {
            fibonacciArray[i] = fibonacci(i);
        }
        return fibonacciArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci elements to generate: ");
        int n = scanner.nextInt();

        int[] fibonacciSequence = fibonacciArray(n);
        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSequence[i] + " ");
        }


    }
}
