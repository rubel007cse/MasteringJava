package TestingJavaException.exercise;

/**
 * Created by mosharrofrubel on 1/17/17.
 */
public class FinallyPrac {

    public static void main(String[] args){

        int i = 0;

        try {
            System.out.println(20 / i);
        } catch (ArithmeticException e){
            System.out.println(e);
        } finally {
            i = 2;
        }

        System.out.println("Vaule of i is changed to finnaly block. i = "+i);


    }

}
