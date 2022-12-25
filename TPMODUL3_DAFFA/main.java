package TPMODUL3_DAFFA;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            restaurant menu = new restaurant();
            int orderQyt, customerID;
            try { 
                System.out.println("Enter Customer ID: ");
                customerID = input.nextInt();

                System.out.println("Enter how much food to made: ");
                orderQyt = input.nextInt();

                Thread d1 = new Thread(menu);
                waiters waiters = new waiters(orderQyt, customerID);
                Thread d2 = new Thread(waiters);

                d1.start();
                d2.start();
                d1.join();
                d2.join();
            } catch (Exception e) {
                System.out.println("Input must be Integer!");
            }
        }

    }
}
    

