package exper;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author E.Parominsky 18/05/2024 09:29
 */
public class ExecutorServiceExample {

    public static void main(String[] args) {
        // Создание пула потоков из 5 потоков
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Отправка задач на выполнение
        for (int i = 0; i < 10; i++) {
            int taskNumber = i;
            executorService.submit(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println("Task " + taskNumber + " is being executed by " + threadName);
                try {
                    Thread.sleep(2000); // Имитация работы
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Task " + taskNumber + " executed by " + threadName + " is completed");
            });
        }

        // Завершение работы пула потоков
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
    }
}
