package exper;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author E.Parominsky 18/05/2024 09:12
 */
public class AtomicReferenceExample {

    private AtomicReference<String> atomicStringReference = new AtomicReference<>("initial value");

    public String getValue() {
        return atomicStringReference.get();
    }

    public void setValue(String newValue) {
        atomicStringReference.set(newValue);
    }

    public boolean compareAndSetValue(String expect, String update) {
        return atomicStringReference.compareAndSet(expect, update);
    }

    public static void main(String[] args) {
        AtomicReferenceExample example = new AtomicReferenceExample();

        System.out.println("Initial Value: " + example.getValue());

        // Using set method
        example.setValue("new value");
        System.out.println("Updated Value: " + example.getValue());

        // Using compareAndSet method
        boolean result = example.compareAndSetValue("new value", "final value");
        System.out.println("CAS Result: " + result);
        System.out.println("Final Value: " + example.getValue());

        // Attempting a failed CAS operation
        result = example.compareAndSetValue("wrong value", "another value");
        System.out.println("CAS Result: " + result);
        System.out.println("Value after failed CAS: " + example.getValue());
    }
}
