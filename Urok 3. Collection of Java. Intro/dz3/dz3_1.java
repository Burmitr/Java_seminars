package dz3;

import java.util.Random;

// Задание 1. Реализовать алгоритм сортировки слиянием

public class dz3_1 {
    int[] array;
    int arrayLength = 0;

    public dz3_1(int length) {
        if (length > 0) {
            array = new int[length];
            arrayLength = length;
        }
    }

    private void merge(int[] workArray, int lower, int middle, int upper) { // Слияние двух массивов
        int i = 0;
        int lowerBound = lower;
        int mid = middle - 1;
        int n = upper - lower + 1;
        while ((lower <= mid) && (middle <= upper)) {
            if (array[lower] < array[middle]) {
                workArray[i++] = array[lower++];
            } else {
                workArray[i++] = array[middle++];
            }
        }
        while (lower <= mid) {
            workArray[i++] = array[lower++];
        }
        while (middle <= upper) {
            workArray[i++] = array[middle++];
        }
        for (i = 0; i < n; i++) {
            array[lowerBound + i] = workArray[i];
        }
    }

    private void recMergeSort(int[] workArray, int lower, int upper) { // Рекурсивный метод
        if (lower == upper) {
            return;
        } else {
            int middle = (lower + upper) / 2;
            recMergeSort(workArray, lower, middle);
            recMergeSort(workArray, middle + 1, upper);
            merge(workArray, lower, middle + 1, upper);
        }

    }

    public void fillArray() { // Заполняем массив
        if (arrayLength > 0) {
            Random random = new Random();
            for (int i = 0; i < arrayLength; i++) {
                array[i] = random.nextInt(100);
            }
        }
    }

    public void printArray() { // Выводим массив
        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("%3d ", array[i]);
        }
        System.out.println();
    }

    public void sort() {
        int[] workArray = new int[arrayLength];
        recMergeSort(workArray, 0, arrayLength - 1);
    }

    public static void main(String[] args) {
        dz3_1 mS = new dz3_1(20);
        mS.fillArray();
        mS.printArray();
        mS.sort();
        System.out.println("Отсортированный массив:");
        mS.printArray();
    }

}
