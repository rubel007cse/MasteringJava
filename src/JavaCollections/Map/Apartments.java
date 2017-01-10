package JavaCollections.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mosharrofrubel on 1/10/17.
 */
public class Apartments {
    public static void main(String[] args){

        Map<String, String> apartments = new HashMap<>();

        apartments.put("1A", "Faruq Hossain");
        apartments.put("1B", "Leo Ahmed");
        apartments.put("2A", "Tanzila Islam");
        apartments.put("2B", "Sheikh Mizan");
        apartments.put("3A", "Ashriqur Rahman");
        apartments.put("3B", "Monirul Hasan");

        // printing all values from HashMap
        System.out.println("No\t\tOwner\n-----------------------");
        for(Map.Entry appar : apartments.entrySet()){

            System.out.println(appar.getKey()+"\t\t"+appar.getValue());

        }

    }
}
