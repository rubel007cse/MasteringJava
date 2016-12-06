package LoopingThings;

/**
 * Created by mosharrofrubel on 12/6/16.
 */
public class LoopPractice {
    public static void main(String[] args){

        // ---- 'while loop' -----
        int roll = 1;

        while( roll <= 100 ) {
            System.out.print("Student's Roll: " + roll +"\n");
            roll = roll+1;
        }
        // We have counted 1 to 100 student's roll with 'while' loop.
        // '<=' means, we are checking if roll is less than or equal to 100
        // 'roll=roll+1' means, when loop executes one time, rool adds one to previous roll
        // '\n' is used to create a new line




        // ------- 'for loop ' --------

        for( int i=1; i <= 100; i++ ) {
            System.out.print("Value of i: " + i +"\n");
        }


        // ------ ' do while loop ' -------
        int j = 1;
        do {
            System.out.print("j = " + j +"\n");
            j = j+1;
        } while( j <= 10 );

        // do something until, while loop is true

    }
}
