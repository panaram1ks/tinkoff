package leetcode.suminlist;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SumInList {

    public static boolean containsSumOfTwoElements(int[] mass, int sum) {
        Set<Integer> differenceFromSubtraction = new HashSet<>();
        for (int element : mass) {
            if (differenceFromSubtraction.contains(element)) {
                return true;
            }
            int tail = sum - element;
            differenceFromSubtraction.add(tail);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] mass1 = new int[]{1, 2, 3, 4, 9}; // sum = 8
        int[] mass2 = new int[]{7, 3, 4, 11, 4, 9}; // sum = 8
        System.out.println(containsSumOfTwoElements(mass1, 8));
        System.out.println(containsSumOfTwoElements(mass2, 8));
    }

}
