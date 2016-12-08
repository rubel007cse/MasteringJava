package OverRidingAndOverLoading;

/**
 * Created by mosharrofrubel on 12/8/16.
 */
public class OverRidingAndOverLoadingPractice extends MyFather {
    public static void main(String[] args){

        OverRidingAndOverLoadingPractice cool_object = new OverRidingAndOverLoadingPractice();
        cool_object.cars_of_my_father();
        cool_object.lands_of_my_father("Dhaka");

    }


    // Below method is 'OverRidden' from MyFather Class
    public void cars_of_my_father(){
        System.out.println("Royal Rayce, Maruti Suzuki, Mazda");
    }

    // Below method is 'OverLoaded' from MyFather class
    public void lands_of_my_father(String location){
        System.out.println(location+", Chittagong, Noakhali");
    }

    /*
        OverRiding: Same method names, same arguments different method body
        OverLoading: Same method name, different arguments and different method body

     */


}
