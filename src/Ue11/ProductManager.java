package Ue11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> productList = new ArrayList<>();



    public void add(Product newProduct) {
        System.out.println("ProductManager: adding Product");
        productList.add(newProduct);
    }


 public void saveToFile(String filepath) throws IOException {
        File f = new File(filepath);
     FileWriter fW = new FileWriter(f);
     BufferedWriter bW = new BufferedWriter(fW);
     for (Product p : productList) {
         System.out.println("ProductManager: saveToFile: saving Produkt '" + p.toString() + "' ");
         bW.write(p.toString());
         bW.newLine(); //so am schönsten, gilt für alle plattformen
     }
     bW.flush();
     bW.close();
 }
 public void readFromFile(String path) throws IOException {
     FileReader fr = new FileReader("Ue11.txt"); //zum oeffnen der Dateien könnte schon lesen auch
     //aber sehr low level
     BufferedReader br = new BufferedReader(fr);
     //hier wird der fileReader an den BufferedReader weitergegeben


     String zeile = br.readLine(); //zeile ist ein Objekt
     while(zeile !=null) {
         System.out.println(zeile);
         zeile = br.readLine();
     }
     br.close(); //um datei wieder zu schließen
 }

     //System in ist spezielle Datei für Tastatureingabe
    //aber sehr low level

    //hier wird der fileReader an den BufferedReader weitergegeben



}
