package ThisKeyword;

/**
 * Created by mosharrofrubel on 12/22/16.
 */
public class InvokingCurrentConstructor {

    public InvokingCurrentConstructor(){
        System.out.println("invoked constructor");
    };

    public InvokingCurrentConstructor(String s){
        this();
        System.out.println(s);

        // Run this code commenting this(); to see the difference

    };

    public static void main(String[] a){
           InvokingCurrentConstructor is = new InvokingCurrentConstructor("Sonam");
    }

}
