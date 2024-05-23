package exper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

/**
 * @author E.Parominsky 18/05/2024 09:39
 */
public class ParallelStreamExample {

    public static void main(String[] args) {
        // Создание большого списка чисел для демонстрации
        List<Integer> largeList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            largeList.add(i);
        }

        // Создание ForkJoinPool с 1000 потоками
        ForkJoinPool customThreadPool = new ForkJoinPool(1000);

        try {
            long beginMS = System.currentTimeMillis();
            // Использование customThreadPool для выполнения parallelStream
            customThreadPool.submit(() ->
                    largeList.parallelStream().forEach(num -> process(num))
            ).get();
            long endMS = System.currentTimeMillis();
            System.out.println("<<<<<<<<<<<<<<<<<" + (endMS - beginMS));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            customThreadPool.shutdown();
        }

        long beginMS = System.currentTimeMillis();
        largeList.parallelStream().forEach(num -> process(num));
        long endMS = System.currentTimeMillis();
        System.out.println("<<<<<<<<<<<<<<<<<" + (endMS - beginMS));
    }

    private static void process(int num) {
        // Симуляция некоторой работы с числом
//        System.out.println(Thread.currentThread().getName() + " processing " + num);
        try {
            Thread.sleep(10); // Имитация длительной операции
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
