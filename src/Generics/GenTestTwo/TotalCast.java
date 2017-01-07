package Generics.GenTestTwo;

/**
 * Created by mosharrofrubel on 1/7/17.
 */
public class TotalCast {

    public static void main(String[] ag) {

        Movies<Integer> object = new Movies<Integer>();
        object.keep_data(39);

        System.out.println("Total Cast: "+object.get_data());

    }

}
