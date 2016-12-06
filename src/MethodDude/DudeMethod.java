package MethodDude;

/**
 * Created by mosharrofrubel on 12/6/16.
 */
public class DudeMethod {
    /*
     ----- Declaring My First Method -----
        Our method will accept two int number as Argument and return the added result
    */
    public static  int adding_numbers(int num1, int num2){

        int result = num1+num2;
        return result;
    }

    public static void main(String[] args){

        // Calling the Method
        int my_data = adding_numbers(15,50);
        System.out.println(my_data);

        // Calling multiplication method
        doing_multiplication(30,5);

    }



    // ----- Method without Return Type -----
    public static void doing_multiplication(int  i, int j){
        int result2 = i*j;
        System.out.println("Multiplication result is: " + result2);
    }


    /*
        'static' keyword in java is used for memory management mainly.
        we access method statically by using static keyword.
     */

}
