package Threads;

public class CounterThread implements Runnable {
    public void run() {
        Thread thread = Thread.currentThread();
        for (int count = 0; count <= 20; ++count) {
            System.out.println(thread + "COUNT: " + count);
        }
    }
}


