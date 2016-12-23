package JavaThread;

import static java.lang.Thread.sleep;

/**
 * Created by mosharrofrubel on 12/23/16.
 */
public class UsingRunnable implements Runnable {

    public static void main(String[] args){

        UsingRunnable rt = new UsingRunnable();
        Thread t = new Thread(rt);
        t.start();

    }

    @Override
    public void run() {

        for (int i=0; i < 11; i++){
            try {
                // Let the thread sleep for 1200 mili seconds.
                sleep(1200);
            } catch (InterruptedException threadExep) {
                threadExep.printStackTrace();
            }
            System.out.println("Loading.. "+i*10+"%");
        }
    }
}
