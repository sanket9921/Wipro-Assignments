import java.util.Scanner;
//Write a program that declares two integer variables,
// swaps their values without using a third variable, and prints the result.
public class SwapNumbers {
    public static void main(String[] args) {
        int a = 25;
        int b = 30;

        System.out.println("The Number before swap");

        System.out.println("A = "+a);
        System.out.println("B = "+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("The Number after swap");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
    }
}
