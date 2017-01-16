package JavaThread.exercise;

import static java.lang.Thread.sleep;

/**
 * Created by mosharrofrubel on 1/17/17.
 */
public class ThreadExer implements Runnable{

    public static void main(String[] args){

        ThreadExer threadExer = new ThreadExer();
        threadExer.run();
    }

    @Override
    public void run() {


        try {

            for(int i=1; i <= 5; i++){
                System.out.println("Printing.. "+(i*20)+"%");
                sleep(1200);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
