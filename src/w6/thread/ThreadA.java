package w6.thread;

public class ThreadA implements Runnable {
    char c;
    Object lock;

    public ThreadA(char c, Object lock) {
        this.c = c;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (lock) {
                System.out.print(c);
            }
        }
    }
}
