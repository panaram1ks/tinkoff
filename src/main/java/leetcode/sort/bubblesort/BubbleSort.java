package leetcode.sort.bubblesort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[]{6, 5, 3, 1, 8, 7, 2, 4};
        Arrays.stream(bubbleSort(array)).forEach(System.out::println);
    }

    public static int[] bubbleSort(int[] example) {
        for (int i = 0; i < example.length; i++) {
            for (int j = 0; j < example.length; j++) {
                if (example[i] < example[j]) {
                    int temp = example[i];
                    example[i] = example[j];
                    example[j] = temp;
                }
            }
        }
        return example;
    }
}
