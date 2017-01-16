package Generics.exercises.exercise1;

/**
 * Created by mosharrofrubel on 1/15/17.
 */
public class Sweets<T> {

    private T quality;
    private T quantity;

    void keep_quality(T q){
        quality = q;
    }

    T see_quality(){
        return quality;
    }

    void keep_quantity(T qu){
        quantity = qu;
    }

    T see_quantity(){
        return quantity;
    }
}
