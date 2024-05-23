package exper;

import java.util.concurrent.Semaphore;

class Resource {
    private final Semaphore semaphore;

    public Resource(int permits) {
        this.semaphore = new Semaphore(permits);
    }

    public void useResource() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " получил доступ к ресурсу.");
            // Имитация работы с ресурсом
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " освобождает ресурс.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            semaphore.release();
        }
    }
}
