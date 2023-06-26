package org.example.Recursion;

import java.util.Arrays;

public class SimpleRecursion {
    public static int recursiveSum(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 1, newArray, 0, newArray.length);

        return (array[0]) + (recursiveSum(newArray));
    }

    private static int quantity = 0;
    public static int recursiveQuantity(int[] array) {
        if (array.length == 0) {
            return quantity;
        }

        quantity++;

        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 1, newArray, 0, newArray.length);

        return (recursiveQuantity(newArray));
    }

    public static void main(String[] args) {
        int[] array1 = {3, 1, 7, 5, 9, 15, 26 , 8, 2, 11, 46};
        System.out.println(Arrays.toString(array1));

        System.out.println("Sum of elements: " + SimpleRecursion.recursiveSum(array1));
        System.out.println("Quantity of elements: " + SimpleRecursion.recursiveQuantity(array1));
    }
}
