package leetcode;

import leetcode.collections.arrayList.ArrayListMy;

public class TestsMain {
    public static void main(String[] args) {

        ArrayListMy arrayListMy = new ArrayListMy();
        arrayListMy.push(300);
        arrayListMy.push(200);
        arrayListMy.push(100);
        System.out.println(arrayListMy);
        arrayListMy.delete(0);
        System.out.println(arrayListMy);
        arrayListMy.delete(1);
        System.out.println(arrayListMy);


    }
}
