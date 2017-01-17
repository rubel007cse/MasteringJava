package PolyMorphismBingo.exercises.dynamicPoly;

/**
 * Created by mosharrofrubel on 1/17/17.
 */
public class Zoo {

    public static void main(String[] args){

        Animal animal;

        animal = new Dog();
        System.out.print("Dog is ");
        animal.barking();

        System.out.println();

        animal = new Cat();
        System.out.print("Cat is ");
        animal.barking();

    }



}
