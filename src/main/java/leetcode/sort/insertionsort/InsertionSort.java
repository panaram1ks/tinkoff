package leetcode.sort.insertionsort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = new int[]{6, 5, 3, 1, 8, 7, 2, 4, 300, 0, 99, -10};
        // TODO работает не правильно!!!!
        insertionSort(array);
    }

    public static void insertionSort(int[] example) {
        outerLoop:
        // Это метка для внешнего цикла
        for (int i = 0; i < example.length; i++) {
            if (example[i] < example[0]) {
                int temp = example[0];
                example[0] = example[i];
                example[i] = temp;
            } else {
                for (int j = 1; j < i; j++) {
                    if (example[i] < example[j]) {
                        // TODO нужно записать меньший элемент в ячейку где элемент оказался меньше текущего а все остальные элементы сдвинуть вправо и прервать внутренний цикл
                        System.arraycopy(example, i, example, j, i - j);
                        continue outerLoop;
                    }
                }
            }
        }
        Arrays.stream(example).forEach(System.out::println);
    }

}
