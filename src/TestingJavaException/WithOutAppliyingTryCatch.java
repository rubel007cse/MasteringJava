package TestingJavaException;

/**
 * Created by mosharrofrubel on 12/6/16.
 */
public class WithOutAppliyingTryCatch {

    public static void main(String [] args) {


        String[] names = {"Lina", "Jiya", "Ruhin"};
        System.out.println("Name of the student is, " + names[10]);

        // As there's no exception handling, compiler won't able to execute next lines.
        // Program will be stopped after getting exception

        System.out.println("Going to next lines...");

    }
}
