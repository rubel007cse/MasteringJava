package SimplySingleTon.exercise;

/**
 * Created by mosharrofrubel on 1/18/17.
 */
public class Connection {
    private static Connection ourInstance = new Connection();

    public static Connection getInstance() {
        return ourInstance;
    }

    private Connection() {
    }

    void message(){
        System.out.println("Connection Established..");
    }

}
