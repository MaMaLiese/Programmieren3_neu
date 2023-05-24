package Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Ue8mitException
{
    public static void main(String[] args) {

        InputStreamReader iSr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(iSr);



//        String zeile = br.readLine(); //zeile ist ein Objekt
//        while (zeile != null && !zeile.equals  ("STOP")) {
//            System.out.println(zeile);
//            zeile = br.readLine();

//oder mit if:
        String zeile = null;
        try {
            zeile = br.readLine();
            while (zeile != null) {
                if (zeile.equals("STOP")) { //oder: if.zeile.toLowerCase.equals("stop")
                    break;
                }
                System.out.println(zeile);
                zeile = br.readLine();

            }


            br.close();
            throw new IOException("Fehler: Das ist eine Testexception.");
        } catch (IOException meineException) {
            System.out.println("Fehler: IO Exception, " +
                    "etwas ist schief gelaufen. Nachricht: " +
                    meineException.getMessage());
        }


//
    }
}