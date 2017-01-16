package ArrayFantastic.exercise;

/**
 * Created by mosharrofrubel on 1/15/17.
 */
public class ArrayExample1 {

    public static void main(String[] args){

        int[] salaries = new int[10];

        salaries[0] = 2500;
        salaries[1] = 2500;
        salaries[2] = 3500;
        salaries[3] = 4500;
        salaries[4] = 5500;
        salaries[5] = 6500;
        salaries[6] = 7500;
        salaries[7] = 8500;
        salaries[8] = 9500;
        salaries[9] = 1500;

        for(int i=0; i < salaries.length; i++){
            System.out.println("Salary is: "+salaries[i]);
        }

    }

}
