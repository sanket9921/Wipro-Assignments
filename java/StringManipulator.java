
//Write a method that takes two strings, concatenates them,
// reverses the result, and then extracts the middle substring of
// the given length. Ensure your method handles edge cases, such as an empty
// string or a substring length larger than the concatenated string.

import java.util.Scanner;

public class StringManipulator {
    public static String extractMiddleSubstring(String str1, String str2, int length) {
        System.out.println("Concatenated String : ");

        String concatenated = str1.concat(str2);
        System.out.println(concatenated);
        System.out.println("Reverse String: ");
        String reversed = new StringBuilder(concatenated).reverse().toString();
        System.out.println(reversed);
        int middleIndex = reversed.length() / 2;
        int startIndex = middleIndex - length / 2;
        if (length > reversed.length()) {
            return "Substring length is larger than the concatenated string.";
        } else if (reversed.isEmpty()) {
            return "Concatenated string is empty.";
        }

        return reversed.substring(startIndex, startIndex + length);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First String");

        String str1 = scanner.nextLine();
        System.out.println("Enter the Second String");
        String str2 = scanner.nextLine();
        System.out.println("Enter the middle length");
        int length = scanner.nextInt();

        String result = extractMiddleSubstring(str1, str2, length);
        System.out.println("Middle Substring: " + result);
    }
}
