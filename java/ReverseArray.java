
//Create a program that declares an array of integers,
// initializes it with consecutive numbers,
// and prints the array in reverse order.
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the number into the array");
        for (int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Array is ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Array in reverse order");
        for (int i=size-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }
}
