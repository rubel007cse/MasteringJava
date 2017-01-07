package Generics.GenClass;

import java.util.Iterator;

/**
 * Created by mosharrofrubel on 1/7/17.
 */
public class Emp {

    public static void main(String[] ag){

        Ages<Integer> object = new Ages<Integer>();

        object.keep_data(26);

        // remove comment to see compile time error
        // object.keep_data("Sami");

        System.out.println("Age is: "+object.get_data());

    }

}
