package JavaThread;

/**
 * Created by mosharrofrubel on 12/8/16.
 */
public class MyThread implements Runnable {
    public static void main(String[] args){
    System.out.println("Downloading two files..:");

    // we are creating a thread object below
    Thread t1 = new Thread() {
        /*
         After t1.start , execution comes here to look for run
         Then the codes in run should be executed. So, go check t1.start() first.
         */
        public void run() {
            for (int k = 0; k <= 3; k++) {
                System.out.println("File 1 downloading " + k * 5 + "%");

                try {
                    // Let the thread sleep for 1200 mili seconds.
                    sleep(1200);
                } catch (InterruptedException threadExep) {
                    threadExep.printStackTrace();
                }
            }

        }

    };
    // now, this will call run method
  t1.start();

    Thread t2 = new Thread() {
        public void run() {
            for (int k = 0; k <= 3; k++) {
                System.out.println("File 2 Downloading " + k * 5 + "%");

                try {
                    sleep(1000);
                } catch (InterruptedException threadExep) {
                    threadExep.printStackTrace();
                }
            }

        }

    };

  t2.start();


    /*
    ------- Using Runnable Interface(run method must be overridden): --------

     Step 1: We will Create an object of the class. Which is obj1 here.
     Step 2: Create a thread object and pass the class object through it
     Step 3: Start the thread, do operation.

     */
      MyThread obj1 = new MyThread();
      Thread t3 = new Thread(obj1);
      t3.start();


  /*

    This can be written as:

   Thread t3 = new Thread(new simpMyThreadleThread());
   t3.start();

   * */

}

    @Override
    public void run() {
            System.out.println("This is my T3 thread!");
    }

}
