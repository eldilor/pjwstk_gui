package w7;

public class CharRunner extends Thread {
    private char chr;
    private Thread thread;

    public CharRunner(char chr) {
        this.chr = chr;
        this.start();
    }

    public void serThread(Thread thread) {
        this.thread = thread;
    }

    public void run() {
        do {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(this.chr);

            try {
                this.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (this.thread != null) {
               synchronized (this.thread) {
                   thread.notify();
               }
           }
        } while (!Thread.currentThread().isInterrupted());
    }
}
