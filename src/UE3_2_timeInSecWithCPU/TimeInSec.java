package UE3_2_timeInSecWithCPU;

import java.util.Date;

public class TimeInSec implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread von TimeInSec: " + Thread.currentThread().getName());
        for (int i = 0; i <= 10; i++) {
            Date d = new Date();
            System.out.println(d.toString());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            
        }
}


    }
