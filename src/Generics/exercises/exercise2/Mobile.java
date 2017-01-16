package Generics.exercises.exercise2;

/**
 * Created by mosharrofrubel on 1/15/17.
 */
public class Mobile<T> {

    T obj;

    void taking_data(T obj){
        this.obj = obj;
    }

    T get_data(){
        return obj;
    }

}
