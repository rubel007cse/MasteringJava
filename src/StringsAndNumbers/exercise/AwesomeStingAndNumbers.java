package StringsAndNumbers.exercise;

/**
 * Created by mosharrofrubel on 12/6/16.
 */
public class AwesomeStingAndNumbers {

    public static void main(String[] args){

        String firstName = "Ishtiaq ";
        String lastName = "Rayhan";

        String name = firstName+lastName;
        System.out.println(name);


        String house = "House number is: ";
        int number = 207;

        String houseNumber = house+number;
        System.out.println(houseNumber);


        String justNumber = "15";
        int getInt = Integer.parseInt(justNumber);
        System.out.println(getInt);
        //'Integer.parseInt' is used to parse integer from string.


        // Getting  absolute value of numbers by using 'Math.abs' method
        double num1 = -13.63;
        System.out.println("Absolute number is "+Math.abs(num1));

        // Getting round figure by 'Math.round' method.
        double num2 = 23.3;
        System.out.println("Round figure is "+Math.round(num2));


        String text = "Mastering java";
        System.out.println("Length is: " + text.length());

    }

}
