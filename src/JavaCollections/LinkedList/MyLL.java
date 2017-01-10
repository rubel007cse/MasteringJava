package JavaCollections.LinkedList;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by mosharrofrubel on 1/8/17.
 */
public class MyLL {

    public static void main(String[] args){

        // taking a list
        List<Movie> my_movie_list = new LinkedList<Movie>();

        Movie m1 = new Movie(1, "Keyamot theke Keyamot", 9.4, "Salman Shah", "Moushumi", "No idea");
        Movie m2 = new Movie(2, "Matir Moyna", 9.2, "Unknown", "Unknown", "Mishuk Monir");
        Movie m3 = new Movie(3, "Aguner Poroshmoni", 9.8, "Azaz Ahemd", "Humayun Paridhi", "Humayun Ahmed");

        // keep the movies to linkedlist
        my_movie_list.add(m1);
        my_movie_list.add(m2);
        my_movie_list.add(m3);


        // getting the movies
        for(Movie m : my_movie_list){
            System.out.println("Movie ID: "+m.mov_id);
            System.out.println("Movie Name: "+m.name);
            System.out.println("Movie Rating: "+m.rating);
            System.out.println("Movie Lead Actor: "+m.lead_actor);
            System.out.println("Movie Lead Actress: "+m.lead_actress);
            System.out.println("Movie Lead Director: "+m.director);
            System.out.println("");

        }

        // let's remove Movie 2
        my_movie_list.remove(1);

        System.out.println("-----Printing after removieng one item------");

        // getting the movies, after removing
        for(Movie m : my_movie_list){
            System.out.println("Movie ID: "+m.mov_id);
            System.out.println("Movie Name: "+m.name);
            System.out.println("Movie Rating: "+m.rating);
            System.out.println("Movie Lead Actor: "+m.lead_actor);
            System.out.println("Movie Lead Actress: "+m.lead_actress);
            System.out.println("Movie Lead Director: "+m.director);
            System.out.println("");

        }


    }

}
