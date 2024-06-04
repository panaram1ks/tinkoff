package leetcode.similarelementtwice;


import java.util.HashSet;
import java.util.Set;

public class SimilarElementTwice {

    public static void main(String[] args) {

        // it should return 2
        int[] mass1 = new int[]{2, 5, 1, 2, 3, 5, 1, 2, 4};
        // it should return 1
        int[] mass2 = new int[]{2, 1, 1, 2, 3, 5, 1, 2, 4};
        // it should return null
        int[] mass3 = new int[]{2, 3, 4, 5};

        Integer first = containsTwins(mass1);
        Integer second = containsTwins(mass2);
        Integer third = containsTwins(mass3);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        Integer first2 = inefficientWayContainsTwins(mass1);
        Integer second2 = inefficientWayContainsTwins(mass2);
        Integer third2 = inefficientWayContainsTwins(mass3);
        System.out.println(first2);
        System.out.println(second2);
        System.out.println(third2);

    }

    public static Integer containsTwins(int[] example) {
        Set<Integer> alreadyContains = new HashSet<>();
        for (int i = 0; i < example.length; i++) {
            boolean add = alreadyContains.add(example[i]);
            if (!add) {
                return example[i];
            }
        }
        return null;
    }

    public static Integer inefficientWayContainsTwins(int[] example) {
        for (int i = 0; i < example.length; i++) {
            for (int j = i + 1; j < example.length; j++) {
                if (example[i] == example[j]) {
                    return example[i];
                }
            }
        }
        return null;
    }

}
