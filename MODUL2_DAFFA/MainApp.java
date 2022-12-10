package MODUL2_DAFFA;

public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir transportAir =  new TransportasiAir(20, 100000);
        System.out.println("(Transportasi Air Tidak Diketahui)");

        transportAir.informasi();
        transportAir.berlayar();
        transportAir.berlabuh();
        System.out.println(" ");


        Sampan sampan = new Sampan(5, 20000, 1);
        System.out.println("(Transportasi Air Sampan)");

        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(2);
        System.out.println(" ");

        Kapal kapal = new Kapal(30, 200000, "Super Kencang");
        System.out.println("(Transportasi Air Kapal)");

        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(50);
        kapal.berlabuh();
        System.out.println(" ");
        

    }
}

