//This operation counts how many times a specific number appears in the array.

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 4, 9, 2, 4, 1};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to count: ");
        int target = scanner.nextInt();
        int count = 0;

        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        System.out.println("The number " + target + " occurs " + count + " times.");
    }
}
