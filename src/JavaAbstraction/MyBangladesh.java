package JavaAbstraction;

/**
 * Created by mosharrofrubel on 12/8/16.
 */
public abstract class MyBangladesh {

    // default constructor . Because we want to extend the class from other class.
    public MyBangladesh(){}

    public void area_of_bd(){
        System.out.print("Area: 147,570 sq.km");
    }
    public void population_of_bd(){
        System.out.println("Population: 160million");
    }

    // abstract method
    public abstract void cool_abstract_method();



}
