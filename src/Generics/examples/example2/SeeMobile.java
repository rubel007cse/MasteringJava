package Generics.examples.example2;

/**
 * Created by mosharrofrubel on 1/15/17.
 */
public class SeeMobile {

    public static void main(String[] y){

        Mobile<Integer> mobile_amonut = new Mobile<>();
        mobile_amonut.taking_data(5);

        Mobile<String> mobile_name = new Mobile<>();
        mobile_name.taking_data("Xiaomi Mi");

        System.out.println("Total mobiles: "+mobile_amonut.get_data());
        System.out.println("Mobile name: "+mobile_name.get_data());

    }

}

