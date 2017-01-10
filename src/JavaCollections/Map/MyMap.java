package JavaCollections.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mosharrofrubel on 1/10/17.
 */
public class MyMap {

    public static void main(String[] args){

        Map<String, String> reset = new HashMap<>();

        reset.put("hi@mrubel.com","833hgd3o");
        reset.put("himel@hash.com","himel245");
        reset.put("robin@yahoo.com", "rob3345");
        reset.put("shimul@gmail.com", "shim46543");

        // resetting password for robin
        for(Map.Entry map : reset.entrySet()){
            if(map.getKey().equals("robin@yahoo.com")){
                System.out.println("Your password for email is: "+map.getValue());
            }
        }

    }

}
