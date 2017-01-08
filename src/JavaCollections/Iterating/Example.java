package JavaCollections.Iterating;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by mosharrofrubel on 1/8/17.
 */
public class Example {

    public static void main(String[] args){
        String[] movie_names = {"Batman", "Superman", "Spiderman", "Antman", "Deadpool", "Captain America", "Thor"};
        ArrayList<String> super_heros = new ArrayList();

        // inserting array to array list
        for(int i=0; i < movie_names.length; i++){
            super_heros.add(movie_names[i]);
        }

        // Iterating Method 1
        System.out.println("Iterating Method 1:");
        for(String s : super_heros){
            System.out.println(s);
        }

        System.out.println("");


        // Iterating method 2
        System.out.println("Iterating Method 2:");

        // having in iterator
        Iterator my_iterator = super_heros.iterator();

        // looping through items
        while(my_iterator.hasNext()){
            String p = (String) my_iterator.next();
            System.out.println(p);
        }


    }

}
