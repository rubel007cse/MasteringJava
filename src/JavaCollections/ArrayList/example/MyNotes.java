package JavaCollections.ArrayList.example;

import java.util.ArrayList;

/**
 * Created by mosharrofrubel on 1/16/17.
 */
public class MyNotes {

    public static void main(String[] ar){

        ArrayList<String> notes = new ArrayList();
        notes.add("I will go to shop tomorrow");
        notes.add("Presentation on next Saturday");
        notes.add("Few important tricks, stay focused");
        notes.add("Life is good. tour at next week");

        for(String s : notes){
            System.out.println("Note: "+s);
        }

        System.out.println();
        notes.remove(2);

        for(String s : notes){
            System.out.println("Updated Note: "+s);
        }

        System.out.println("Clearing starts....");
        notes.clear();

        for(String s : notes){
            System.out.println("Updated Note: "+s);
        }
        System.out.println("All cleared!");
    }

}
