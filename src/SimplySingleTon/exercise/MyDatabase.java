package SimplySingleTon.exercise;

/**
 * Created by mosharrofrubel on 1/18/17.
 */
public class MyDatabase {

    public static void main(String[] args){

        Connection c = Connection.getInstance();
        c.message();

    }

}
