package exper;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SemaphoreExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Resource resource = new Resource(2); // Семафор с двумя разрешениями

        for (int i = 0; i < 5; i++) {
            executor.submit(resource::useResource);
        }

        executor.shutdown();
    }

}
