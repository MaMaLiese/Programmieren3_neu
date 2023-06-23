package Ue11;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("ue11 starting...");

        Product p1 = new Product("Name1", 11.50, "Kategorie1");
        Product p2 = new Product("Name2", 11.50, "Kategorie2");

//        System.out.println("Mein 1. Produkt: " + p1.toString());
        ProductManager pm1 = new ProductManager();
        pm1.add(p1);
        pm1.add(p2);
        pm1.saveToFile("Ue11.txt");
        pm1.readFromFile("Ue11.txt");
    }
}
