package Abschlussuebung_IO;

import java.sql.SQLOutput;

public class MainAdressen {
    public static void main(String[] args) {
        System.out.println("Demo starting up...");
        Address mann = new Address("King", "Kong", "81 316 7", "king@superking.biz");
        Address b = new Address("Kang", "Long", "81 316 8", "king@superking.biz");


        System.out.println("Meine Testadresse: " + mann ); //hier wird nur ausgeprintet
        System.out.println("WEitere Adresse : " + b);
        AddressManager am = new AddressManager(); //ein Objekt von der Klasse AddressManager
        //aufrufen der Methode
        am.add(b);
        am.add(mann);
        am.printAllAddresses();

    }
}
