package Generics.GenTestTwo;

/**
 * Created by mosharrofrubel on 1/7/17.
 */
public class Director {

    public static void main(String[] ag) {

        Movies<String> object = new Movies<String >();
        object.keep_data("Michael Bay");

        System.out.println("Director is: "+object.get_data());

    }
}