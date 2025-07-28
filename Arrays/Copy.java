//Create a duplicate of the given array using a loop.

public class ArrayCopy {
    public static void main(String[] args) {
        int[] original = {10, 20, 30};
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        for (int num : copy) {
            System.out.print(num + " ");
        }
    }
}
