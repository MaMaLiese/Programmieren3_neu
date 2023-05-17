

import java.io.*;
//Aufgabe: ein Programm schreiben/kopieren das einen Text aus ener DAtei liest, und auf die Konsole schreibt

class ReadFile1
{
    public static void main(String[] args) throws IOException
    {
        //pfad ausgeben von Datei
        File f = new File("Progr3_1705.txt");
        //erstellt ein neues Objekt vom Typ file; kann Datei oder auch Verzeichnis sein; kann existieren oder auch noch nicht
        System.out.println(f.getAbsolutePath());
        System.out.println("Hallo programm");
        FileReader fr = new FileReader("Progr3_1705.txt"); //zum oeffnen der Dateien könnte schon lesen auch
        //aber sehr low level
        BufferedReader br = new BufferedReader(fr);
        //hier wird der fileReader an den BufferedReader weitergegeben


        String zeile = br.readLine(); //zeile ist ein Objekt
        while(zeile !=null) {
            System.out.println(zeile);
            zeile = br.readLine();
        }
        br.close(); //um datei wieder zu schließen
       //fr.close(); //damit wieder andere auf Datei zugreifen können, bearbeiten etc.; damit Datei auch wieder geschlossen wird



//            String zeile1 = br.readLine();
//            System.out.println(zeile1);
//        String zeile2 = br.readLine();
//        System.out.println(zeile2);
//        String zeile3 = br.readLine();
//        System.out.println(zeile3);

//      br.close();
    }
}



