//Delete an element by shifting remaining elements left from that position.

import java.util.Arrays;

public class ArrayDeletion {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int pos = 2; // delete element at index 2
        int n = arr.length;

        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("After Deletion: " + Arrays.toString(Arrays.copyOf(arr, n - 1)));
    }
}
