package TPMODUL2_DAFFA;

public class handphone extends perangkat {
    protected boolean fingerprint;

    public handphone(String drive, int ram, float processor,boolean fingerprint){
        super(drive,ram,processor);
        this.fingerprint = fingerprint;

    }
    
    @Override
    public void informasi(){
        if (this.fingerprint == true){
            System.out.printf("Handphone ini memiliki dirve tipe %s dengan ram sebesar %d gb dan processor secepat %.2f Ghz. Selain itu handphone ini juga memiliki fingerprint %n",drive, ram, processor);
        } else {
            System.out.printf("Handphone ini memiliki dirve tipe %s dengan ram sebesar %d gb dan processor secepat %.2f Ghz. Selain itu handphone ini tidak memiliki fingerprint %n",drive, ram, processor);
        }
        
        }

    public void telephone(int phoneNumber){
        System.out.printf("Handphone berhasil menyambungkan telfon ke No %s %n",phoneNumber);
    }

    public void sms(int phoneNumber){
        System.out.printf("Handphone berhasil mengirim SMS ke No %s %n",phoneNumber);
    }

    public void sms(int phoneNumber1, int phoneNumber2){
        System.out.printf("Handphone berhasil mengirim SMS ke No %s dan ke %s %n",phoneNumber1,phoneNumber2);
    }
}
