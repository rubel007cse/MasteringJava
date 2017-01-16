package IfElseDecisionMaking.exercise;

import java.util.Scanner;

/**
 * Created by mosharrofrubel on 1/15/17.
 */
public class LiftMechanism {
    public static void main(String[] args){

        System.out.println("Press 0-3 :");
        Scanner s = new Scanner(System.in);
        int floor_no = s.nextInt();

        if(floor_no == 0) {
            System.out.println("This is Ground Floor");
        } else if(floor_no == 1) {
            System.out.println("This is First Floor");

        }else if(floor_no == 2) {
            System.out.println("This is Second Floor");

        }else if(floor_no == 3) {
            System.out.println("This is Third Floor");

        } else {
            System.out.println("No more floors!");
        }



    }
}
