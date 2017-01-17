package TestingJavaException.exercise;

/**
 * Created by mosharrofrubel on 1/17/17.
 */
public class PracException {

    public static void main(String[] args){

        int i = 0;

        try {
            System.out.println(10 / i);
        } catch (ArithmeticException e){
            System.out.println(e);
        }

        int p = 10, q = 11;
        System.out.println("p+q is: "+(p+q));


    }


}
