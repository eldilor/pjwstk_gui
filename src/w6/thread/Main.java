package w6.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Object lock = new Object();

        ThreadA threadA = new ThreadA('a', lock);
        ThreadA threadB = new ThreadA('b', lock);
        ThreadA threadC = new ThreadA('c', lock);

        new Thread(threadA).start();
        new Thread(threadB).start();
        new Thread(threadC).start();

        // ========== NEXT ==========

        new Thread(
                () -> {
                    synchronized (lock) {
                        for (int i = 0; i < 10; i++) {
                            System.out.print('d');
                        }
                    }
                }
        ).start();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> {/*...*/});
    }
}
