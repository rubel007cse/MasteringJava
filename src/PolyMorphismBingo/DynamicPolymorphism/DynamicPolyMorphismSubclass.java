package PolyMorphismBingo.DynamicPolymorphism;

/**
 * Created by mosharrofrubel on 12/8/16.
 */
public class DynamicPolyMorphismSubclass {
    public static void main(String[] args ){

        DynamicPolyMorphismSuperclass _obj;

        _obj = new DynamicPolyMorphismSuperclass();
        _obj.learning_programming();


        // creating another object with 'MyJava' class
        // As DynamicPolyMorphismSuperclass extended 'MyJava' so, we'll get properties of it because of Inheritance
        _obj = new MyJava();
        _obj.learning_programming();


        // So, here same object  acted differently! Just because of polymorphism.

    }

}
