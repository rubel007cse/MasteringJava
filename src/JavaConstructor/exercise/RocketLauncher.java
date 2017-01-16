package JavaConstructor.exercise;

/**
 * Created by mosharrofrubel on 1/16/17.
 */
public class RocketLauncher {

    public RocketLauncher() {
        System.out.println("OMG! Object Created! Rocket Launch initialized!");
    }

    public static void main(String[] args){

        RocketLauncher rocketLauncher = new RocketLauncher();
        rocketLauncher.startRocket();



    }

    void startRocket(){
        System.out.println("Rocket starting..");
    }

}
