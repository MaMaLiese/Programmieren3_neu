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


 public void saveToFile(String filepath)  {
        File f = new File(filepath);
     FileWriter fW = null;
     try {
         fW = new FileWriter(f);
     } catch (IOException e) {
         throw new RuntimeException(e);
     }
     BufferedWriter bW = new BufferedWriter(fW);
     for (Product p : productList) {
         System.out.println("ProductManager: saveToFile: saving Produkt '" + p.toString() + "' ");
         try {
             bW.write(p.toString());
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
         try {
             bW.newLine(); //so am schönsten, gilt für alle plattformen
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
     }
     try {
         bW.flush();
     } catch (IOException e) {
         throw new RuntimeException(e);
     }
     try {
         bW.close();
     } catch (IOException e) {
         throw new RuntimeException(e);
     }
 }
 public void readFromFile(String path)  {
     FileReader fr = null; //zum oeffnen der Dateien könnte schon lesen auch
     try {
         fr = new FileReader("Ue11.txt");
     } catch (FileNotFoundException e) {
         throw new RuntimeException(e);
     }
     //aber sehr low level
     BufferedReader br = new BufferedReader(fr);
     //hier wird der fileReader an den BufferedReader weitergegeben


     String zeile = null; //zeile ist ein Objekt
     try {
         zeile = br.readLine();
     } catch (IOException e) {
         throw new RuntimeException(e);
     }
     while(zeile !=null) {
         System.out.println(zeile);
         try {
             zeile = br.readLine();
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
     }
     try {
         br.close(); //um datei wieder zu schließen
     } catch (IOException e) {
         throw new RuntimeException(e);
     }
 }

     //System in ist spezielle Datei für Tastatureingabe
    //aber sehr low level

    //hier wird der fileReader an den BufferedReader weitergegeben



}
