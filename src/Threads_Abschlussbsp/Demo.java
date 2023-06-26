package Threads_Abschlussbsp;

public class Demo {
    public static void main(String[] args) {
        TimePrintWorker w1 = new TimePrintWorker("TimeWorker Dimma");
       Thread t1 = new Thread(w1);

       FileReadWorker w2 = new FileReadWorker("FileWorker Reeda", "C:\\Users\\s53031\\Documents\\for_loop.txt");
       Thread t2 = new Thread(w2);
       t1.start();
       t2.start();

       try {
           t2.join(); //warte bis file fertig gelesen wurde
           w1.stopWorker();
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }


    }
}
