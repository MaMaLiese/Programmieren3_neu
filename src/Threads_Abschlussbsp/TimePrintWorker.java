package Threads_Abschlussbsp;

import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class TimePrintWorker extends Worker implements Runnable{


    public TimePrintWorker(String name_) {
        super(name_);
    }
    @Override
    public void run() { //das interface Runnable zwingt mich dazu run() zu implementieren
     work(); //weil es thread ist wird work() in run() aufgerufen
    }

    @Override
    protected void work() { //die überklasse Worker zwngt mich dazu work() zu implementieren
        printStarted();
        while(shouldRun==true) {

            Date d = new Date();
            System.out.println(d.toString() + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                printStopped();

            }

        }
        }

}

