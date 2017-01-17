package UnderstnadingGetterSetter.exercise;

import java.util.Scanner;

/**
 * Created by mosharrofrubel on 1/17/17.
 */
public class TurnOffPc {

    double sleep_time;

    public double getSleep_time() {
        return sleep_time;
    }

    public void setSleep_time(double sleep_time) {
        this.sleep_time = sleep_time;
    }

    public static void main(String[] args){

        System.out.println("Enter turning off time: ");
        Scanner scanner = new Scanner(System.in);
        double give_time = scanner.nextDouble();

        TurnOffPc tpc = new TurnOffPc();
        tpc.setSleep_time(give_time);

        double receiving_time = tpc.getSleep_time();

        if( receiving_time > 2.00){
            System.out.println("Turning off pc...");
        } else {
            System.out.println("Keep it awake..");
        }

    }


}
