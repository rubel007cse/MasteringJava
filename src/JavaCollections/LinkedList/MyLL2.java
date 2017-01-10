package JavaCollections.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by mosharrofrubel on 1/10/17.
 */
public class MyLL2 {

    public static void main(String[] args){
        String[] peoples = {"Lina", "Shazfa", "Tiya", "Sina", "Mou", "Afrin", "Tareq", "Jiya", "Sonam"};

        // declaring LinkedList
        LinkedList<String> names = new LinkedList<>();

        //inserting values to array list
        for(int i=0; i < peoples.length; i++){
            names.add(peoples[i]);
        }

        // showing the result
        System.out.println("\n-----LinkedList Output-----\n");
        for(String s : names){
            System.out.println("Name: "+s);
        }

        // --- --- removing 4th element, which is 'Sina' --- ---
        names.remove(3);

        // showing the result again
        System.out.println("\n-----After removing 4th element-----\n");
        for(String s : names){
            System.out.println("Name: "+s);
        }



        // --- --- Adding a vale at first --- ---
        names.addFirst("Tania");

        // showing the result again
        System.out.println("\n-----After adding an element at first-----\n");
        for(String s : names){
            System.out.println("Name: "+s);
        }


        // --- --- Adding a vale at last --- ---
        names.addLast("Munni");

        // showing the result again
        System.out.println("\n-----After adding an element at last-----\n");
        for(String s : names){
            System.out.println("Name: "+s);
        }

    }

}
