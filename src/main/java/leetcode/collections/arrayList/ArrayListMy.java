package leetcode.collections.arrayList;

import java.util.Arrays;

public class ArrayListMy {

    Integer[] data = null;
    int length;

    public ArrayListMy() {
        data = new Integer[10];
    }

    public ArrayListMy(Integer[] array, int length) {
        this.data = array;
        this.length = length;
    }

    public Integer get(int index) {
        return data[index];
    }

    public int push(Integer item) {
        data[length] = item;
        return ++this.length;
    }

    public Integer delete(int index) {
        Integer item = this.data[index];
        this.shiftItems(index);
        return item;
    }

    private void shiftItems(int index) {
        Integer[] arrayAfterDelete = new Integer[data.length];
        if ((index - 1) == 0) {
            System.arraycopy(data, 0, arrayAfterDelete, 0, 1);
        } else if ((index - 1) == -1) {
            System.arraycopy(data, 1, arrayAfterDelete, 1, data.length - 1);
        }
        for (int j = index; j < data.length - 1; j++) {
            arrayAfterDelete[j] = data[j + 1];
        }

        data = arrayAfterDelete;
        length--;
    }


    @Override
    public String toString() {
        return "ArrayListMy{" +
                "data=" + Arrays.toString(data) +
                ", length=" + length +
                '}';
    }
}
