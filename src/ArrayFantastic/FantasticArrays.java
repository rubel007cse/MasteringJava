package ArrayFantastic;

/**
 * Created by mosharrofrubel on 12/6/16.
 */
public class FantasticArrays {
    public static void main(String[] args){

        // declaring a String Array
        String[] my_supercool_array = new String[5];

        // declaring an Array if you already know the values
        String[] my_students = {"Arif", "Sohan", "Swarna", "Neha", "Tumpa", "Rohan", "Sanjid"};


        // putting a value into Array with index number
        //Below line, a value is kept in the first position of the array.
        my_supercool_array[0] = "Captain America";

        // Printing a value of Array
        System.out.println(my_supercool_array[0]);

        // show size of an Array
        int size_of_array = my_students.length;
        System.out.println("Size of the 'my_students' arrazy is: "+size_of_array);

        // looping out and seeing all the values of an array
        for(int i=0; i < size_of_array; i++){
            System.out.println("Name of studen is,  "+my_students[i]);
        }

    }
}

