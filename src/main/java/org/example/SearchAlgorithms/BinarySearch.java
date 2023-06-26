package org.example.SearchAlgorithms;

import java.util.Arrays;

public class BinarySearch {
    static Integer binarySearch (int[] array, int item) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];
            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                high = mid - 1;
            } else low = mid + 1;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 5, 7, 8, 9, 11, 15, 26, 46};
        System.out.println(Arrays.toString(array1));

        System.out.println("Element is in " + BinarySearch.binarySearch(array1, 8) + " positions");
    }
}
