package JavaThread.exercise;

/**
 * Created by mosharrofrubel on 1/17/17.
 */
public class ThreadExer2 {

    public static void main(String[] ar){

        Thread t = new Thread(){
            public void run(){

                for(int k=1; k <=20; k++){
                    System.out.println("Running.. "+(k*5)+"%");
                    try {
                        sleep(700);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }

        };
        t.start();


    }

}
