//Find the largest value present in the array.

public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {5, 10, 25, 3, 19};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        System.out.println("Maximum element: " + max);
    }
}
