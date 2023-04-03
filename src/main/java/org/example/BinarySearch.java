package org.example;

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
}
