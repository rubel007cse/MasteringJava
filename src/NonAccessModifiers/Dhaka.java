package NonAccessModifiers;

/**
 * Created by mosharrofrubel on 12/23/16.
 */
public class Dhaka {

    // ---------- static exercise ------------
    static String population = "160m";

    static void housing(){
        System.out.println("Dhaka housing calculation..");
    }


    // ---------- final exercise ------------
    final String dhaka_area = "104 sq miles";

    // trying to change dhaka_area values
    final public void increaseArea(){

        // remove comment to see effect
      //  dhaka_area = "200 sq miles";
    }
}
