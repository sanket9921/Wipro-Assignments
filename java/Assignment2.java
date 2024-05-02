
//Create a program that simulates a simple calculator using command-line
// arguments to perform and print the result of addition, subtraction, multiplication,
// and division..

public class CommandLine {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("A+B = " +(a+b));
        System.out.println("A-B = " +(a-b));
        System.out.println("A*B = " +(a*b));
        System.out.println("A/B = " +(a/b));
    }
}
