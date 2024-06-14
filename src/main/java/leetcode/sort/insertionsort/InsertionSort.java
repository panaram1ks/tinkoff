package leetcode.sort.insertionsort;

import java.util.Arrays;

public class InsertionSort {

    /**
     * Метод insertionSort:
     * Проходим по массиву начиная со второго элемента (i = 1).
     * Для каждого элемента (key) проверяем, если элементы в отсортированной части массива (слева от текущего) больше текущего элемента, то сдвигаем их на одну позицию вправо.
     * Вставляем текущий элемент на правильную позицию.
     * <p>
     * Как работает Insertion Sort:
     * Инициализируем первый элемент как отсортированный.
     * Проходим по остальным элементам, вставляя каждый элемент в правильную позицию в отсортированной части массива.
     * Повторяем этот процесс до тех пор, пока все элементы не будут на своих местах.
     */

    public static void main(String[] args) {
        int[] array = {12, 11, -30, 13, 5, 0, 6};
        insertionSort(array);
        Arrays.stream(array).forEach(System.out::println);
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int key = array[i];
            int j = i - 1;

            // Перемещаем элементы массива [0..i-1], которые больше ключа,
            // на одну позицию вперед от их текущей позиции
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

}
