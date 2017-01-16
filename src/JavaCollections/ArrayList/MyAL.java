package JavaCollections.ArrayList;

import java.util.ArrayList;

/**
 * Created by mosharrofrubel on 1/7/17.
 */
public class MyAL {

    public static void main(String[] args){

        ArrayList<String> myAL = new ArrayList<String>();
        myAL.add("Rafi");
        myAL.add("Konok");
        myAL.add("Santa");

        System.out.println("Index 1 is: "+myAL.get(1));
        System.out.println("Size of ArrayList: "+myAL.size());

    }

}
