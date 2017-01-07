package Generics.GenTestTwo;

/**
 * Created by mosharrofrubel on 1/7/17.
 */
public class Movies<T> {

    T mov;

    // to add data
    void keep_data(T obj){
        mov  = obj;
    }


    // to retrive and see data
    T get_data(){
        return mov;
    }


}
