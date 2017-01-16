package JavaCollections.LinkedList.example;

import java.util.LinkedList;

/**
 * Created by mosharrofrubel on 1/16/17.
 */
public class Relatives {

    public static void main(String[] a){

        LinkedList<String> relatives = new LinkedList<>();

        relatives.addLast("Mother");
        relatives.addLast("Uncle");
        relatives.addLast("Son of Uncle");
        relatives.addLast("Son's cousin");
        relatives.addLast("Cousin's Sister");

        for(String q : relatives){
            System.out.println("Relative: "+q);
        }

        System.out.println("\nAdding new element at 3rd position..\n");

        relatives.add(3, "Son's Brother");
        for(String q : relatives){
            System.out.println("Relative: "+q);
        }

        System.out.println("\nAdding new at last..\n");

        relatives.addLast("Sister's Aunt");
        for(String q : relatives){
            System.out.println("Relative: "+q);
        }

    }

}
