package leetcode.sort.selectionsort;

import java.util.Arrays;

/**
 * @author E.Parominsky 18/06/2024 08:24
 */
public class SelectionSort2 {

    public static void main(String[] args) {
        int[] example = {10, -20, 30, 0, 40};
        int[] sorted = selectionSort2(example);
        Arrays.stream(sorted).forEach(System.out::println);
    }

    private static int[] selectionSort2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            int temp = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < array[min]){
                    min = j;
                }
            }
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }
}
