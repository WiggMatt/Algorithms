package org.example.SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] sortArr) {
        // Создаем копию исходного массива
        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
        // Создаем временный буфер, в котором будем хранить результаты сортировки
        int[] buffer2 = new int[sortArr.length];
        // Вызываем метод сортировки с рекурсивными вызовами
        return mergeSortInner(buffer1, buffer2, 0, sortArr.length);
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        // Если массив состоит из одного элемента, он уже отсортирован
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        // Разбиваем массив на две части
        int middle = startIndex + (endIndex - startIndex) / 2;
        // Рекурсивно сортируем каждую из двух частей
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        // Слияние двух отсортированных частей
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        // Выбираем меньший элемент из двух отсортированных частей и помещаем его в результирующий массив
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1; // Используем результат предыдущего вызова метода
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        // Добавляем оставшиеся элементы из первой части, если таковые имеются
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        // Добавляем оставшиеся элементы из второй части, если таковые имеются
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
    public static void main(String args[]) {
        int[] sortArr = {3, 1, 7, 5, 9, 15, 26 , 8, 2, 11, 46};
        int[] result = mergeSort(sortArr);
        System.out.println(Arrays.toString(result));
    }
}
