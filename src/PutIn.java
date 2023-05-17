import java.io.*;
//Aufgabe: ein Programm schreiben/kopieren das einen Text aus ener DAtei liest, und auf die Konsole schreibt

class PutIn
{
    public static void main(String[] args) throws IOException {

        InputStreamReader iSr = new InputStreamReader(System.in); //System in ist spezielle Datei für Tastatureingabe
        //aber sehr low level
        BufferedReader br = new BufferedReader(iSr);
        //hier wird der fileReader an den BufferedReader weitergegeben


//        String zeile = br.readLine(); //zeile ist ein Objekt
//        while (zeile != null && !zeile.equals  ("STOP")) {
//            System.out.println(zeile);
//            zeile = br.readLine();

//oder mit if:
            String zeile = br.readLine();
            while (zeile!=null){
            if(zeile.equals("STOP")){ //oder: if.zeile.toLowerCase.equals("stop")
                break;
            }
                System.out.println(zeile);
            zeile = br.readLine();

        }

            //strg + d ---> ende file....



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
