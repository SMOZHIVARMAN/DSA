//Find the smallest value present in the array.

public class ArrayMin {
    public static void main(String[] args) {
        int[] arr = {5, 10, 1, 30, 2};
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        System.out.println("Minimum element: " + min);
    }
}
