package StringsAndNumbers;

import static java.lang.Math.abs;

/**
 * Created by mosharrofrubel on 12/6/16.
 */
public class AwesomeStingAndNumbers {

    public static void main(String[] args){

        String text1 = "Welcome to the app, Mr. ";
        String text2 = "Zubayer";

        // Concating two strings
        String final_string = text1+text2;
        System.out.println(final_string);



        // concating uses plus(+) sign to concat string and others values
        String t1 = "Your age is: ";
        int age = 15;

        String final_output = t1+age;
        System.out.println(final_output);


        // showing the length of string
        System.out.println("Length of t1 string is: " + t1.length());


        // getting number from string
        String no = "45";
        int i = Integer.parseInt(no);
        System.out.println(i);
        // 'Integer.parseInt' is used to parse integer from string.


        // Getting  absolute value of numbers by using 'Math.abs' method
        double d = -23.43;
        System.out.println(Math.abs(d));

        // Getting round figure by 'Math.round' method.
        double d2 = 23.53;
        System.out.println(Math.round(d2));
    }

}
