package TPMODUL2_DAFFA;

public class MainApp {
    public static void main(String[] args) throws Exception {
        perangkat Perangkat = new perangkat("Adata", 16, 1.8f );
        Perangkat.informasi();
        System.out.println();

        laptop Laptop = new laptop ("Seagate", 16, 2.4f, true);
        Laptop.informasi();
        Laptop.openGame("Valorant");
        Laptop.sendEmail("daffaganteng@gmail.com");
        Laptop.sendEmail("daffaganteng@gmail.com", "daffaganteng123@gmail.com");
        System.out.println();

        handphone hp = new handphone("sandsik", 8,2.2f,true);
        hp.informasi();
        hp.telephone(62812345);
        hp.sms(62812345);
        hp.sms(62812345, 62854321);
        System.out.println();

    }
}