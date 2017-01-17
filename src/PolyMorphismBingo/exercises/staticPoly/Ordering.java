package PolyMorphismBingo.exercises.staticPoly;

/**
 * Created by mosharrofrubel on 1/17/17.
 */
public class Ordering {

    void orderingItems(String i1){
        System.out.println("Customer has ordered 1 item! Item is: "+i1);
    }


    void orderingItems(String i1, String i2){
        System.out.println("Customer has ordered 2 items! Items are: "+i1+", "+i2);
    }



    void orderingItems(String i1, String i2, String i3){
        System.out.println("Customer has ordered 3 items! Items are: "+i1+", "+i2+", "+i3);
    }


    void orderingItems(String i1, String i2, String i3, String i4){
        System.out.println("Customer has ordered 4 items! Items are: "+i1+", "+i2+", "+i3+ ", "+i4);    }

}
