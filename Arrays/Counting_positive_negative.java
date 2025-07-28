//Loop through the array and count how many elements are positive or negative.

public class CountPositiveNegative {
    public static void main(String[] args) {
        int[] arr = {-5, 3, -2, 6, 0, -7, 4};
        int pos = 0, neg = 0;

        for (int num : arr) {
            if (num > 0) pos++;
            else if (num < 0) neg++;
        }

        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);
    }
}
