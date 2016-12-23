package JavaThread;

/**
 * Created by mosharrofrubel on 12/23/16.
 */
public class WithOutExtending {

    public static void main(String[] arg) {

        Thread t1 = new Thread() {
            public void run() {

                for (int i=0; i < 6; i++){
                    try {
                        // Let the thread sleep for 1200 mili seconds.
                        sleep(1200);
                    } catch (InterruptedException threadExep) {
                        threadExep.printStackTrace();
                    }
                    System.out.println("Loading 2.. "+i*10+"%");
                }
            }
        };
        // now, this will call run method
        t1.start();

    }
}