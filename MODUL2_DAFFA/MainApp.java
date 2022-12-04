package MODUL2_DAFFA;

public class MainApp {
    public static void main(String[] args) {
        perangkat Perangkat = new perangkat(drive "AppData", ram : 16, processor : 1.8f );
        Perangkat.informasi();
        System.out.println();

        laptop Laptop = new laptop (drive : "Gege", ram : 16, processor : 2.4f, webcam : true);
        Laptop.informasi();
        Laptop.openGame(gameName : "Valorant");
        Laptop.sendEmail(email : "daffaganteng@gmail.com");
        Laptop.sendEmail(email1 : "daffaganteng@gmail.com", email2 : "daffaganteng123@gmail.com");
        System.out.println();

        handphone hp = new phone (drive : "Sandisk", ram : 16, processor :2.2f, fingerprint : true);
        hp.informasi();
        h.telephone(phoneNumber : 089123456);
        h.sms(phoneNumber : 089123456);
        h.sms(phoneNumber1 : 08987654, phoneNumber2 : 089167854);
        System.out.println();
    }
}