package TestingJavaException;

/**
 * Created by mosharrofrubel on 12/6/16.
 */
public class UsingFinallyBlock {


    public static void main(String[] args) {

        String[] names = {"Lina", "Jiya", "Ruhin"};
        try {
            System.out.println("Student Name is: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The Exception is :" + e);
        } finally {
            System.out.println("Something went wrong unexpectedly!");
        }

        // -- We can use 'finally block' if we want to take a decision after executing try-catch

    }
}
