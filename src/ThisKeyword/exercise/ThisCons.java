package ThisKeyword.exercise;

/**
 * Created by mosharrofrubel on 1/17/17.
 */
public class ThisCons {

    public ThisCons() {
        System.out.println("This is a constructor!");
    }

    public ThisCons(int i) {
        this();
        // used to invoke the current class constructor
        System.out.println("This is ANOTHER constructor! Value is: "+i);
    }


    public static void main(String[] args){

        ThisCons tc = new ThisCons(12);

    }

}
