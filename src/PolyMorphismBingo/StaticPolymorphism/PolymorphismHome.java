package PolyMorphismBingo.StaticPolymorphism;

import PolyMorphismBingo.StaticPolymorphism.JustFewCoolMethods;

/**
 * Created by mosharrofrubel on 12/8/16.
 */
public class PolymorphismHome {
    public static void main(String [] args){

        // creating object and calling methods
        JustFewCoolMethods m_object = new JustFewCoolMethods();
        System.out.println(m_object.multiply_numbers(3,5));
        System.out.println(m_object.multiply_numbers(3,4,5));

        // Same methods, behaving differently - This is called staticPoly polymorphism


    }
}
