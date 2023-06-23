package UE3_1_timeInSec;

public class MainTimeInSec {
    public static void main(String[] args) {
        System.out.println("Thread von main: " + Thread.currentThread().getName());

        Runnable tis = new TimeInSec();

        Thread t1 = new Thread(tis);
        t1.start(); //ruft run-funktion auf



    }
}