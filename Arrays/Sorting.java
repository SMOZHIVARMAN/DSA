//Arrange the elements of the array in ascending order.

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {25, 10, 5, 30, 15};
        Arrays.sort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
