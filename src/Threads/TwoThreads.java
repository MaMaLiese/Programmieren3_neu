package Threads;

public class TwoThreads {
    public static void main(String[] args) {
        CounterThread counter = new CounterThread();
        Thread secondThread = new Thread(counter, "second");
        secondThread.start();
        counter.run();
    }
}

