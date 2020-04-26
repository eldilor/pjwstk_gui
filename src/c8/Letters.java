package c8;

import java.util.ArrayList;
import java.util.Iterator;

public class Letters implements Iterable<Thread> {
    ArrayList<Thread> threads = new ArrayList<>();

    public Letters(String text) {
        for (String letter : text.split("")) {
            threads.add(
                    new Thread(
                            () -> {
                                try {
                                    while (true) {
                                        System.out.print(letter);

                                        Thread.sleep(1000);
                                    }
                                } catch (InterruptedException e) {

                                }
                            },
                            "Thread " + letter
                    )
            );
        }
    }

    public void start() {
        for (Thread thread : threads) {
            thread.start();
        }
    }

    public void stop() {
        for (Thread thread : threads) {
            thread.stop();
        }
    }

    @Override
    public Iterator<Thread> iterator() {
        return threads.iterator();
    }
}
