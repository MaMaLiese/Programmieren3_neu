package Ue16;

import java.io.*;

public class Ue16 {
    public static class myClass implements Serializable{
        int a = 5;
        String b = "Hallo in der Klasse";
        byte[] c = {'e', 'x', 'a', 'm', 'p', 'l', 'e'};
        double d = 8.7;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Objekt schreiben......................
        System.out.println("Hier geht's los :");
        String text = "Hallo Welt";
        String text2 = "Boring Welt hallö mit\"Ö\"";
        File file = new File("object.dat");
        System.out.println("Meine object.daa ist hier: " + file.getAbsolutePath());
        FileOutputStream fOs = new FileOutputStream(file);
        ObjectOutputStream oOs = new ObjectOutputStream(fOs);
        oOs.writeObject(text); //schreibe String
        oOs.writeObject((int) 6); //schreibe int
        //mein Objekt erstellen
        myClass meinObjct = new myClass();
        //mein Objekt in Datei schreiben



        oOs.close();
        fOs.close();

        //Object einlesen
        FileInputStream fIs = new FileInputStream("object.dat");
        ObjectInputStream oIs = new ObjectInputStream(fIs);

        String a = (String) oIs.readObject(); //lese String
        int b = 0; //lese int


        System.out.println("Erster String '" + a + "', zweiter String: '" + b + "'");




    }
}
