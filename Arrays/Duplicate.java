//Create a new array containing only unique elements.

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 3, 2, 6, 4};
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Array after removing duplicates: " + set);
    }
}
