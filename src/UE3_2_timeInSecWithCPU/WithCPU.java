package UE3_2_timeInSecWithCPU;

import java.util.Date;

public class WithCPU implements Runnable {

    @Override
    public void run() {
       // System.out.println("Thread von WithCPU: " + Runtime.getRuntime().availableProcessors());
        for (int i = 0; i <= 10; i++) {
          //  Date d = new Date();
          //  System.out.print(d.toString());




            Date d = new Date();

 System.out.print("[");

 System.out.print(d.toString());

System.out.print(", CPUS: ");

System.out.print(Runtime.getRuntime().availableProcessors());

 System.out.print(", FreeMem: ");
 System.out.print(Runtime.getRuntime().freeMemory());

System.out.print("]");




            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }


}

