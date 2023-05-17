package Ue15;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

    public class Ue15 {
        public static void main(String[] args) throws IOException {
            File file = new File("Ue15.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);

           char c = (char) System.in.read();
           while (c != 'x')
           {

                fileOutputStream.write(c);
               System.out.println("Zeichen geschrieben : " + (int) c);
               c = (char) System.in.read(); //liest ein byte
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            System.out.println("fertig");
        }
    }

