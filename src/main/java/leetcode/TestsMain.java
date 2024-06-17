package leetcode;

import leetcode.collections.linkedList.LinkedListMy;

public class TestsMain {
    public static void main(String[] args) {

//        ArrayListMy arrayListMy = new ArrayListMy();
//        arrayListMy.push(300);
//        arrayListMy.push(200);
//        arrayListMy.push(100);
//        System.out.println(arrayListMy);
//        arrayListMy.delete(0);
//        System.out.println(arrayListMy);
//        arrayListMy.delete(1);
//        arrayListMy.delete(0);
//        System.out.println(arrayListMy);

        LinkedListMy linkedListMy = new LinkedListMy(1);
        linkedListMy.append(2);
        linkedListMy.append(3);
        linkedListMy.prepend(4);
        linkedListMy.insert(1, 99);
        linkedListMy.remove(2);

        System.out.println(linkedListMy);


    }
}
