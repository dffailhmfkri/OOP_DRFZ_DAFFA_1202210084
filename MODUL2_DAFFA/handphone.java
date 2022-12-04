package MODUL2_DAFFA;

public class handphone extends perangkat {
    protected boolean fingerprint;

    public handphone(String drive, int ram, float processor,boolean fingerprint){
        super(drive,ram,processor);
        this.fingerprint = fingerprint;

    }
    
    @override
    public void informasi(){
        if (this.fingerprint == true){
            System.out.printf(format : "");
        } else {
            system.printf(format : "");
        }
        
        }

    
}
