package PolyMorphismBingo.DynamicPolymorphism;

/**
 * Created by mosharrofrubel on 12/8/16.
 */
public class DynamicPolyMorphism {
    public static void main(String[] args ){

        MyPython obj;

        obj = new MyPython();
        obj.learning_programming();


        // creating another object with 'MyJava' class
        // As DynamicPolyMorphismSuperclass extended 'MyJava' so, we'll get properties of it because of Inheritance
        obj = new MyJava();
        obj.learning_programming();


        // So, here same object  acted differently! Just because of polymorphism.

    }

}
