//a)  Implement a method SliceArray that takes an array,
// a starting index, and an end index, then returns a new
// array containing the elements from the start to the end index.


import java.util.Scanner;

public class ArraySlicer {
    public static int[] sliceArray(int[] arr, int start, int end) {
        int length = end - start + 1;
        int[] slicedArray = new int[length];
        for (int i = 0; i < length; i++) {
            slicedArray[i] = arr[start + i];
        }

        return slicedArray;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in );
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element into the array");
        for (int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the starting index");
        int startIndex = scanner.nextInt();
        System.out.println("Enter the End Index");
        int endIndex = scanner.nextInt();

        System.out.println("Slice of the array is : ");


        int[] result = sliceArray(arr, startIndex, endIndex);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
