package PlayingWithJavaOperators;

/**
 * Created by mosharrofrubel on 12/6/16.
 */
public class MyJavaOperators {

    public static void main(String[] args){
        
        // ---- Arithmetic Operators ------
        int a = 10;
        int b = 20;
        String text = "Result is: ";
        // ' = ' is a Assignment Operator

        System.out.println(text+ (a + b) );
        System.out.println(text + (b - a) );

        int mark = 60;

        if( mark >= 60 && mark <=80){
            System.out.println("Grade is A");
        }

        // Above ' >= ' and ' <= '  are  Relational Operators
        // ' && ' is Logical Operator
    }

}
