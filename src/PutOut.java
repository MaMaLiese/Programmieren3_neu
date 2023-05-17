import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class PutOut {
    public static void main(String[] args) throws IOException {
        File f = new File("huhu3.txt");
        FileWriter fW = new FileWriter(f, true); //ab hier existiert file; append um im file weiterzuschreiben
        PrintWriter pW = new PrintWriter(fW);

        pW.println("was soll das?!!!!! okele...geflush or what");
        pW.flush(); //löst das schreiben aus
        pW.close();




    }
}
