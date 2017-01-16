package ArrayFantastic.exercise;

/**
 * Created by mosharrofrubel on 1/15/17.
 */
public class ArrayExample2 {

    public static void main(String[] a){

        double[] movie_ratings = {3.8,9.2,7.5,8.2,6.6,4.1,9.0,5.6,2.9,5.0};

        for(int j=0; j < movie_ratings.length; j++){
            System.out.println("Rating is: "+movie_ratings[j]);
        }

        System.out.println("Value of Index no 4 is: "+movie_ratings[3]);

    }

}
