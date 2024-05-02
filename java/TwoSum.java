//a) Given an array of integers, write a program that finds if there are
// two numbers that add up to a specific target. You may assume
// that each input would have exactly one solution, and you may
// not use the same element twice. Optimize the solution for time complexity.
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoSum {

    public static boolean hasTwoSum(int[] nums, int target) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            int complement = target - num;
            if (numSet.contains(complement)) {
                return true;
            }
            numSet.add(num);
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Element into the array");
        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the Target value");
        int target = scan.nextInt();

        System.out.println(hasTwoSum(arr, target));
    }
}
