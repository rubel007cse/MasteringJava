package Generics.GenClass;

/**
 * Created by mosharrofrubel on 1/7/17.
 */
public class Ages<T> {

    T age;

    // to add data
    void keep_data(T obj){
        age  = obj;
    }


    // to retrive and see data
    T get_data(){
        return age;
    }


}
