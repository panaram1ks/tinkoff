package leetcode.sort.selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = new int[]{6, 5, 3, 1, 8, 7, 2, 4, 300, 0, 99, -10};
        selectionSort(array);
        Arrays.stream(array).forEach(System.out::println);
    }

    public static int[] selectionSort(int[] example) {
        for (int i = 0; i < example.length; i++) {
            int min = example[i];
            int indexJ = i;
            for (int j = i; j < example.length; j++) {
                if (example[j] < min) {
                    min = example[j];
                    indexJ = j;
                }
            }
            int temp = example[i];
            example[i] = min;
            example[indexJ] = temp;
        }
        return example;
    }
}
