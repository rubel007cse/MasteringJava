package TestingJavaException;

/**
 * Created by mosharrofrubel on 12/6/16.
 */
public class LearningAboutJavaException {

    public static void main(String [] args) {

        // exception handling test
        try {
            String[] names = {"Lina", "Jiya", "Ruhin"};
            System.out.println("Name of the student is, " + names[10]);

        } catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("The Exception is :" + e);

        }

        System.out.println("Going to next lines...");

    }

}
