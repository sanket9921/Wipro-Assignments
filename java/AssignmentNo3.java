import com.math.operations.*;

import java.util.Scanner;

public class AssignmentNo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication mul = new Multiplication();
        Division div = new Division();

        System.out.println("Enter the two number: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Addition: " + add.add(a, b));
        System.out.println("Subtraction: " + sub.subtract(a, b));
        System.out.println("Multiplication: " + mul.multiply(a, b));
        try {
            System.out.println("Division: " + div.divide(a, b));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
