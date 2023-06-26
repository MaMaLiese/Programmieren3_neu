package Threads_Abschlussbsp;

import java.io.*;
import java.util.ArrayList;

public class FileReadWorker extends Worker implements Runnable{
    private String path;
    public ArrayList<String> lines;
    public FileReadWorker(String name_, String path) {
        super(name_);
        this.path = path;
        lines = new ArrayList<>();
    }


    @Override
    public void run() {
        work();

    }
    @Override
    protected void work() {
       File f = new File(path);
       FileReader fr;
       BufferedReader br;
       String one_line; //was ist der scope einer Methode? Die Aussage darüber wer zugriff auf die Variable hat; ist innerhalb des blocks, wo Variable definiert ist
        System.out.println("Pfad zum file: " + f.getAbsolutePath());
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while ((one_line = br.readLine()) != null) {
                if(shouldRun == false) { //for shutting down gracefully
                    break;
                }
                System.out.println("Read line " + one_line);
                lines.add(one_line);
                Thread.sleep(1000);

            }
            br.close(); //buffered reader braucht try und hier ists noch im try-block drinnen
        } catch (IOException  | InterruptedException e) {
            e.printStackTrace();
        }

        printStopped();
    }


}
