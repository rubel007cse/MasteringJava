package PolyMorphismBingo.exercises.staticPoly;

/**
 * Created by mosharrofrubel on 1/17/17.
 */
public class PlacingOrder {

    public static void main(String[] args){

        Ordering order = new Ordering();
        order.orderingItems("T-Shirt");
        order.orderingItems("T-Shirt", "Sunglass");
        order.orderingItems("T-Shirt"," Sunglass","Cap");
        order.orderingItems("T-Shirt"," Sunglass","Cap", "Belt");


    }

}
