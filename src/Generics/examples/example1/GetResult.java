package Generics.examples.example1;

/**
 * Created by mosharrofrubel on 1/15/17.
 */
public class GetResult {
    public static void main(String[] args){

        Sweets obj = new Sweets<>();

        obj.keep_quality("FRESH");
        obj.keep_quantity(12);

        System.out.println("Quality is: "+obj.see_quality());
        System.out.println("Quantity is: "+obj.see_quantity()+" KG");

    }
}
