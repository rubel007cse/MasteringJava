package UnderstandingClassAndObject.SEUExample;

/**
 * Created by mosharrofrubel on 12/6/16.
 */
public class SoutheastUniversity {

    public static void main(String[] args){

        // Creating Object of 'DeptOfCSE' class
        DeptOfCSE my_object = new DeptOfCSE();
        // accessing the method from 'DeptOfCSE' class
        my_object.cse_faculties();

        /*
            1. How to create a class object?
            ClassName ObjectName = new Class Constructor
            Example: DeptOfCSE object = new DeptOfCSE();

            2. How to access a method from class by object?
            object name . (dot) name of the method
            Example: object.my_methodName();

        */



        // ----- Accessing a method 'static' from other class
        // Classname . (dot) name of the method
        DeptOfCSE.cse_classroom();

    }

}
