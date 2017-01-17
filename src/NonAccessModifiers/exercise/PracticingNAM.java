package NonAccessModifiers.exercise;

/**
 * Created by mosharrofrubel on 1/17/17.
 */
public class PracticingNAM {

    static final int age1 = 50;
    static int age2 = 50;

    public static void main(String[] args){

       // age1 = 23;
        age2 = 24;

        addinNums(10,30,40);

    }

    static void addinNums(int i,int j, int k){
        System.out.println("Result is: "+(i+j+k));
    }


}
