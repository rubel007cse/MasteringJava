package MethodDude.exercise;

/**
 * Created by mosharrofrubel on 1/17/17.
 */
public class LearningMethods {

    public static void main(String[] art){

        justAMethod();

        int result1 = yearToDays(8);
        System.out.println("Result1 is: "+result1);

        String result2 = myName("Taslima");
        System.out.println(result2);
    }

    public static void justAMethod () {
        System.out.println("Just a method called!");
    }

    public static int yearToDays(int year) {
        int k = year*365;
        return k;
    }


    private static String myName(String n){
        String s = "Name is: "+n;
        return s;
    }

}
