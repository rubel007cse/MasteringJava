package Generics;

/**
 * Created by mosharrofrubel on 12/26/16.
 */
public class GenMethods {


    public static <E> void showingMovieDetails(E[] movies){
        for(E mov : movies ){
            System.out.println(mov);
        }
    }


    public static void main(String[] a){

        String[] movie_names = {"Batman", "Superman", "Spiderman", "Antman", "Deadpool", "Captain America", "Thor"};
        Double[] movie_ratings = {8.5,6.5,6.1,4.3,8.9,7.4,6.2};

        System.out.println("Movie Names:");
        showingMovieDetails(movie_names);

        System.out.println("");

        System.out.println("Movie Ratings:");
        showingMovieDetails(movie_ratings);

    }

}
