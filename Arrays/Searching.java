//Check if a specific element exists in the array.

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {4, 7, 11, 18, 25};
        int key = 18;
        boolean found = false;

        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Element Found" : "Element Not Found");
    }
}
