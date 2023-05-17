package Ue14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ue14 {
    public static void main(String[] args) throws IOException {
        File file = new File("Ue14.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        String outputText = "hello File - first Output";
        for(char c : outputText.toCharArray())
        {
            System.out.println("Schreibe char " + (int) c + "in die Datei ..."); //mit int vor c gibt er mir Ganzzahlencode
            fileOutputStream.write(c);
        }
        fileOutputStream.flush();
        fileOutputStream.close();
        System.out.println("fertig");
    }
}
