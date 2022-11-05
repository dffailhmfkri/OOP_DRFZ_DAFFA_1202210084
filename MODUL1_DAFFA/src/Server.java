

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database
        Database database = new Database();
        // TODO Create Menu
            Menu menu1 = new Menu();
            menu1.setNama("Bakso");
            menu1.setHarga(10000);

            Menu menu2 = new Menu();
            menu2.setNama("Brownies");
            menu2.setHarga(15000);

            Menu menu3 = new Menu();
            menu3.setNama("Es Teh");
            menu3.setHarga(5000);

        // TODO Insert Menu to Database


        // TODO Display Main Menu
        System.out.println("1. "+ menu1.getNama()+ "(Makanan) Rp. " + menu1.getHarga());
        // TODO Create User

        // Display Menu
        System.out.println("Selamat Datang di Restoran EAD");
        System.out.println("Silahkan Register Terlebih Dahulu");
        System.out.println("===============================");
    }
}