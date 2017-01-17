package OperatorsCheck.exercise;

/**
 * Created by mosharrofrubel on 12/22/16.
 */
public class LogicalExer {
    public static void main(String[] args){

        boolean p = false;
        boolean q = true;

        boolean resultOfAndIs = p && q;
        boolean resultOfOrIs = p || q;
        boolean resultOfNotIs = !(p && q);

        System.out.println(resultOfAndIs);
        System.out.println(resultOfOrIs);
        System.out.println(resultOfNotIs);

    }
}
