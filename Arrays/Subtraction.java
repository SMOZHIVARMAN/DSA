//Subtract each element from the first one sequentially.

public class ArraySubtraction {
    public static void main(String[] args) {
        int[] arr = {100, 20, 10, 5};
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result -= arr[i];
        }
        System.out.println("Subtraction result: " + result);
    }
}
