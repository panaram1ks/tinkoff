package leetcode.sort.mergesort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = new int[]{99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        int[] answer = mergeSort(numbers);
        Arrays.stream(answer).forEach(System.out::println);
    }

    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int length = array.length;
        int middle = length / 2;
        int[] left = new int[middle];
        int[] right = new int[length - middle];
        // Копируем первую половину элементов в левый массив
        System.arraycopy(array, 0, left, 0, middle);
        // Копируем вторую половину элементов в правый массив
        System.arraycopy(array, middle, right, 0, length - middle);
        // Рекурсивно сортируем обе половины
        left = mergeSort(left);
        right = mergeSort(right);
        // Сливаем отсортированные массивы
        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        // Сливаем элементы из левого и правого массивов в результирующий массив
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        // Копируем оставшиеся элементы из левого массива, если они есть
        while (i < left.length) {
            result[k++] = left[i++];
        }
        // Копируем оставшиеся элементы из правого массива, если они есть
        while (j < right.length) {
            result[k++] = right[j++];
        }
        return result;
    }
}
