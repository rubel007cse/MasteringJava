package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by mosharrofrubel on 12/26/16.
 */
public class WithAL {

    public static void main(String[] args){

        ArrayList<String> al = new ArrayList<String>();

        String[] teachers = {"KMH", "AR", "SM", "RAJ", "SA"};

        for(int i=0; i <teachers.length; i++){
            al.add(teachers[i]);
        }

        al.add("MOSH");
        al.add("AP");
        al.add("TANZ");

       // al.add(12);



        // printing the arraylist with Iterator
        Iterator<String> iterator = al.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }

}
