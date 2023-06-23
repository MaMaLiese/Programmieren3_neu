package Abschlussuebung_IO;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AddressManager {
    private ArrayList<Address> addressList = new ArrayList<>();

    //hier kommt nur die methode
    public void add(Address ixbeliebig) { //name ist wurscht zuvor haben wir es 'a' genannt was jetzt jetzt 'mann'
        addressList.add(ixbeliebig);



    }
    public void printAllAddresses(){
        int i = 0;
        for (Address one_address : addressList) {
            System.out.println("Eintrag " + i + ":");
        }
    }

    public void exportToCsv(String path, String separator) throws AddressExportException, AddressExportFileAlreadyExistsException {
        File f = new File(path);
        if(f.exists()) { //existiert das file
            throw new AddressExportFileAlreadyExistsException("lol, file already exists");
        }

        System.out.println("exportToCsv: baue String zum exportieren zusammen ...");

        for (Address one_address : addressList){
            String one_line = one_address.getFirstname() + separator +
                              one_address.getLastname() + separator +
                              one_address.getMobilNumber() + separator +
                              one_address.getEmail();
            System.out.println("Eintrag: " + one_line); //auf die Konsole schreiben
            bw.flush();
            bw.close();
        } catch (IOException e) {
            throw new A
        }
    }


    public void loadFromCsv(String path, String separator) throws AddressLoadException, AddressLoadWrongFormatException {
        String OneLineFromFile = "";
        System.out.println("loadFromCsv-------");
        String[] outputArray = oneLineFromFile.split("\t", 4);
    }

    public ArrayList<Address> getAddressList() {
        return addressList;
    }
}
