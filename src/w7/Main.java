package w7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        /*
        CharRunner c1 = new CharRunner('a');
        CharRunner c2 = new CharRunner('b');
        CharRunner c3 = new CharRunner('c');

        c1.serThread(c2);
        c2.serThread(c3);
        c3.serThread(c1);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (c1) {
            c1.notify();
        }
        */

        // ==================

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(
                () -> {
                    System.out.println("Hello " + Thread.currentThread().getName());
                }
        );

        try {
            System.out.println("Koniec");
            executorService.shutdown();
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (!executorService.isTerminated()) {
                System.out.println("Nie koniec");
            }

            executorService.shutdownNow();
        }
    }
}
