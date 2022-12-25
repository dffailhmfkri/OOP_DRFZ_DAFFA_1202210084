package TPMODUL3_DAFFA;

public class restaurant implements Runnable {

    private boolean pickup = false;
    private static final Object lock = new Object();
    private static int foodNumber = 1 ;

    @Override
    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setpickup(boolean pickup) {
        this.pickup = pickup;
    }

    public int getFoodNumber() {
        return foodNumber;
    }

    public void makeFood() {
        synchronized(restaurant.lock) { 
            if (this.pickup) {
                try {
                    System.out.println("Restaurant: Waiting for the Waiter to deliver the food");
                    restaurant.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            pickup = true;
            System.out.println("Restaurant: Making food Number " + foodNumber++);
            restaurant.lock.notifyAll();
            System.out.println("Restaurant: Telling the waiter to get the food\n");
            System.out.println("Restaurant: Waiting for the Waiter to deliver the food");
        }
    }

    public static Object getLock() {
        return lock;
    }
}

    
