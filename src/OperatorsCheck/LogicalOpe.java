package OperatorsCheck;

/**
 * Created by mosharrofrubel on 12/22/16.
 */
public class LogicalOpe {
    public static void main(String[] args){

        boolean r = true;
        boolean s = false;

        boolean resultOfAnd = r && s;
        boolean resultOfOr = r || s;
        boolean resultOfNot = !(r && s);

        System.out.println(resultOfAnd);
        System.out.println(resultOfOr);
        System.out.println(resultOfNot);

    }
}
