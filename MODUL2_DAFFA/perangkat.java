package MODUL2_DAFFA;

public class perangkat {
    protected String drive;
    protected int ram;
    protected float processor;

    public Perangkat(string drive, int ram, float processor) {
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;

    }

    public void informasi(){
        System.out.println(format : "Perangkat tidak diketahui memiliki drive tipe %s dengan ram sebesar %d gb dan processor secepat %.2f %n", drive, ram, processor);
    }
}