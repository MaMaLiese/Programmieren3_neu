package UE3_2_timeInSecWithCPU;

public class MainTimeInSec {
    public static void main(String[] args) {
        System.out.println("Thread von main: " + Thread.currentThread().getName());

        Runnable tis = new TimeInSec();
        Runnable cpu = new WithCPU();

//        Thread t1 = new Thread("erst mal", tis, cpu);
//        Thread t2 = new Thread (cpu, tis);
//        t1.start(); //ruft run-funktion auf
//        t2.start();



    }
}