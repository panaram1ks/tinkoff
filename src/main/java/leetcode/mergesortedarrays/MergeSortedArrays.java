package leetcode.mergesortedarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArrays {


    public static void main(String[] args) {
        int[] array1 = new int[]{0, 3, 4, 31};
        int[] array2 = new int[]{4, 6, 30};

        mergeSortedArrays(array1, array2);
    }

    public static List<Integer> mergeSortedArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> mergedArray = new ArrayList<>();
        mergedArray.ensureCapacity(arr1.length + arr2.length);
        // Check input
        if (arr1.length == 0) {
            return Arrays.stream(arr2).boxed().toList();
        }
        if (arr2.length == 0) {
            return Arrays.stream(arr1).boxed().toList();
        }
        int arr1Item = arr1[0];
        int arr2Item = arr2[0];
        int i = 0;
        int j = 0;
        boolean isStoppedLoop = false;
        while (!isStoppedLoop) {
            System.out.println(mergedArray);
            if (arr1Item < arr2Item) {
                mergedArray.add(arr1Item);
                i++;
                arr1Item = arr1[i];
            } else {
                mergedArray.add(arr2Item);
                j++;
                arr2Item = arr2[j];
            }
            if (i > arr1.length && j > arr2.length) {
                isStoppedLoop = true;
                System.out.println("loop is stopped");
            }
        }

        return mergedArray;
    }

}
