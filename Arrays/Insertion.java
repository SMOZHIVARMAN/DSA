//Insert an element at a given position by shifting elements to the right.

import java.util.Arrays;

public class ArrayInsertion {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 10; arr[1] = 20; arr[2] = 30; arr[3] = 40; arr[4] = 50;
        int n = 5; // current size
        int pos = 2; // insert at index 2
        int val = 99;

        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = val;
        n++;

        System.out.println("After Insertion: " + Arrays.toString(Arrays.copyOf(arr, n)));
    }
}

