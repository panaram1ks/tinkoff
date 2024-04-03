package exper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author E.Parominsky 03/04/2024 08:30
 */
public class ListTrimToSize {

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>(1000000);

        array.ensureCapacity(6);
        array.add("One");
        array.add("Two");
        array.add("Three");
        array.add("Four");
        array.trimToSize();

        System.out.println(array);


    }
}
