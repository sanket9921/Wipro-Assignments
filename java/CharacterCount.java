import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();


        str = str.replaceAll(" ", "");

        Map<Character, Integer> charCounts = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        System.out.println(charCounts);
//        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
//            System.out.println(entry.getKey() + "\t" + entry.getValue());
//        }
    }
}
