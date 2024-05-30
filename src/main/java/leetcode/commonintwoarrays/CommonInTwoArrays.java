package leetcode.commonintwoarrays;

import java.util.HashSet;
import java.util.Set;

public class CommonInTwoArrays {

    public static boolean hasCommon(char[] array1, char[] array2) {
        if (array1.length > array2.length) {
            return checkArrays(array1, array2);
        } else {
            return checkArrays(array2, array1);
        }
    }

    public static boolean checkArrays(char[] longestArray, char[] shortestArray){
        Set<Character> twins = new HashSet<>();
        for (char c : longestArray) {
            twins.add(c);
        }
        for (char c : shortestArray) {
            boolean isAdd = twins.add(c);
            if (!isAdd) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[] array1 = new char[]{'a', 'b', 'c', 'd'};
        char[] array2 = new char[]{'z', 'y', 'i'};
        // should return false
        char[] array3 = new char[]{'a', 'b', 'c', 'x'};
        char[] array4 = new char[]{'z', 'y', 'x'};
        // should return false

        System.out.println(hasCommon(array1, array2));
        System.out.println(hasCommon(array3, array4));
    }

}
