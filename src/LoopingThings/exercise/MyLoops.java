package LoopingThings.exercise;

import java.util.Scanner;

/**
 * Created by mosharrofrubel on 1/17/17.
 */
public class MyLoops {
    public static void main(String[] arg){

        int increment = 1;
        while(increment <= 100) {
            System.out.println("Calling.. "+increment);
            increment = increment+1;
        }

       // ------ do while loop --------
        int inc = 1;
        do{
            System.out.println("Number is.. "+inc);
            inc = inc+1;
        } while(inc <= 100);


        int in1 = 20;
        do{
            System.out.println("Do While Test 1: "+in1);
            in1 = in1+1;
        } while(in1 <= 10);

        int in2 = 1;
        while(in2 <= 10){
            System.out.println("Do While Test 2: "+in1);
            in2 = in2+2;
        }


        // --------- for loop -----------

        System.out.println("Enter a valid int: ");
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();

        for(int i=1; i <= j; i ++) {
            System.out.println("Looping to "+j);
        }




    }

}
