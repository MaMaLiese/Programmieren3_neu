import java.io.*;
//Aufgabe: ein Programm schreiben/kopieren das einen Text aus ener DAtei liest, und auf die Konsole schreibt

class PutInOut
{
    public static void main(String[] args) throws IOException {
        InputStreamReader iSr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(iSr);
        File f = new File("Ue10_fix.txt");
        FileWriter fW = new FileWriter(f);
        PrintWriter pW = new PrintWriter(fW);

        String zeile = null;
        zeile = br.readLine();

        while (zeile!=null) {

            if (zeile.toLowerCase().equals("stop")) { //oder: if.zeile.toLowerCase.equals("stop")
                break;
            }
            System.out.println(zeile);
            pW.println(zeile);

//            pW.println("was soll das?!!!!! okele...geflush or what");
            pW.flush(); //löst das schreiben aus
            zeile = br.readLine();
        }
            pW.close();

        //System in ist spezielle Datei für Tastatureingabe
        //aber sehr low level

        //hier wird der fileReader an den BufferedReader weitergegeben


//        String zeile = br.readLine(); //zeile ist ein Objekt
//        while (zeile != null && !zeile.equals  ("STOP")) {
//            System.out.println(zeile);
//            zeile = br.readLine();

//oder mit if:




        }


        //strg + d ---> ende file....




        //fr.close(); //damit wieder andere auf Datei zugreifen können, bearbeiten etc.; damit Datei auch wieder geschlossen wird



//            String zeile1 = br.readLine();
//            System.out.println(zeile1);
//        String zeile2 = br.readLine();
//        System.out.println(zeile2);
//        String zeile3 = br.readLine();
//        System.out.println(zeile3);

//      br.close();

}