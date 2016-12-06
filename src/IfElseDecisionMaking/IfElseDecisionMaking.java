package IfElseDecisionMaking;

/**
 * Created by mosharrofrubel on 12/6/16.
 */
public class IfElseDecisionMaking {
    public static void main(String[] args){

        int age = 21;

        // ------- 'if' statement for decision making -----
        if( age >= 18 ) {
            System.out.println("Your age is over 18!");
        }


        // ------- 'if-else' statement for decision making -----
        int age2 = 12;
        if( age2 >= 18 ) {
            System.out.println("Your age is over 18!");
        } else {
            System.out.println("You are not 18 yet!");
        }


        // ------- 'if-else if' statement for decision making -----
        int year = 2017;

        if( year == 2015 ) {
            System.out.println("It is not a leapyear!");
        }else if( year == 2016 ) {
            System.out.println("It's  a LeapYear!");
        }else if( year == 2017 ) {
            System.out.println("Last year was a leapyear!");
        }else {
            System.out.println("No match found!");
        }

    }
}
