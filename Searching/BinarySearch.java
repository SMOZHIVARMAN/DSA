/** Only works on sorted data.

Find the middle element.

If the target equals the middle, done!

If the target < middle, search the left half.

If target > middle, search the right half.

Repeat, halving the section each time, until found or search space is empty */

public class BinarySearch {
   
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; 
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 15, 21, 27, 35, 42};
        int target = 21;
        System.out.print("Sorted Array: ");
        printArray(arr);
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
