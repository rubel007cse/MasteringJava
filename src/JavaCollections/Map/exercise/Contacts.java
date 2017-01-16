package JavaCollections.Map.exercise;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mosharrofrubel on 1/16/17.
 */
public class Contacts {

    public static void main(String[] args){

        Map<String, String> contacts = new HashMap<>();

        contacts.put("0163649257", "Jeny");
        contacts.put("0154er9557", "Sazia");
        contacts.put("0135664957", "Roni");
        contacts.put("0194645957", "Shimu");
        contacts.put("0144645957", "Rini");

        System.out.println(contacts);

    }
}
