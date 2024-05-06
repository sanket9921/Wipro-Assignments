public class DivideByZeroExample {
    public static void main(String[] args) {
        try {
            int result = divideByZero(10,0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    public static int divideByZero(int numerator,int denominator) {
        return numerator / denominator;
    }
}

