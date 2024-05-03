
//Write a Java program that reads an integer
// and prints whether it is a prime number
// using a for loop and if statements.
import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int number){
        if(number == 1){
            return  true;
        }
        for(int i=2;i<number;i++){
            if(number % i == 0){
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int num = scan.nextInt();
        if(isPrime(num)){
            System.out.println("Number "+num+" is a prime number");
        }else{
            System.out.println("Number "+num+" is  Not a prime number");

        }
    }
}
