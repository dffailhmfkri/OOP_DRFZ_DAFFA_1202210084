package MODUL2_DAFFA;

public class laptop extends perangkat{
    protected boolean webcam;

    public laptop (String drive, int ram, float processor,boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }
        @Override
        public void informasi(){
            if (this.webcam == true) {
                System.out.printf("Laptop ini memiliki dirve tipe %s dengan ram sebesar %d gb dan processor secepat %.2f Ghz. Selain itu laptop ini juga memiliki webcam%n",drive, ram, processor); 
            } else {
                System.out.printf("Laptop ini memiliki dirve tipe %s dengan ram sebesar %d gb dan processor secepat %.2f Ghz. Selain itu laptop ini tidak memiliki webcam %n",drive, ram, processor);
            }

        }
        public void openGame(String gameName){
            System.out.printf("Laptop berhasil membuka game %s %n",gameName);
        }
        public void sendEmail(String email){
            System.out.printf("Laptop berhasil mengirim email ke %s %n",email);
        }
        public void sendEmail(String email1, String email2){
            System.out.printf("Laptop berhasil mengirim email ke %s dan ke %s %n",email1, email2);
        }
}