package leetcode.sort.bubblesort;

import java.util.Arrays;

import static leetcode.sort.bubblesort.BubbleSort.bubbleSort;

/**
 * @author E.Parominsky 17/06/2024 15:20
 */
public class BubbleSort2 {
    public static void main(String[] args) {
        int[] example = {10, -20, 30, 0, 40};
        int[] sorted = bubbleSort2(example);
        Arrays.stream(sorted).forEach(System.out::println);
    }

    private static int[] bubbleSort2(int[] example) {
        for (int i = 0; i < example.length; i++) {
            for (int j = 0; j < example.length; j++) {
                if (example[i] < example[j]) {
                   int temp = example[j];
                   example[j] = example[i];
                   example[i] = temp;
                }
            }
        }
        return example;
    }
}
