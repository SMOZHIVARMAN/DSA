/** Pick a Pivot: Choose (typically last value) as the pivot.

Partition: Rearrange elements. Items < pivot to the left, > pivot to the right.

Recursion: Apply the same logic to left and right subarrays.

Combine: The array becomes sorted as partitions complete */

public class QuickSort {
    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high]; 
        int i = (low - 1); 
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void printArray(int arr[]) {
        for (int el : arr)
            System.out.print(el + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {8, 7, 2, 1, 0, 9, 6};
        System.out.println("Original array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
