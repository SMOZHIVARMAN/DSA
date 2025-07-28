//Reverse the order of elements in an array.

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
