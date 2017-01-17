package OverRidingAndOverLoading.exercise;

/**
 * Created by mosharrofrubel on 1/17/17.
 */
public class Parking extends Garage{

    public static void main(String[] ar){

        Parking parking = new Parking();
        parking.parking_id();
        parking.parking_slot();
        parking.parking_slot("Premio");
    }

    public void parking_id() {
        System.out.println("(Overridden) Every vachel has a parking id! ");
    }


    public void parking_slot() {
        System.out.println("(Overridden) Every vachel have a parking slot! ");
    }


    public void parking_slot(String car) {
        System.out.println("(Overloaded) Every vachel have a parking slot! "+car);
    }

}
