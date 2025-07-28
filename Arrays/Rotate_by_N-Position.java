//Shift all elements to the left/right by N steps.

import java.util.Arrays;

public class LeftRotateByN {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 2;

        for (int r = 0; r < n; r++) {
            int first = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = first;
        }

        System.out.println("After " + n + " rotations: " + Arrays.toString(arr));
    }
}
