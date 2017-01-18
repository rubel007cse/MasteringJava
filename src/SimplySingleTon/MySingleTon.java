package SimplySingleTon;

/**
 * Created by mosharrofrubel on 1/17/17.
 */
public class MySingleTon {
    private static MySingleTon ourInstance = new MySingleTon();

    public static MySingleTon getInstance() {
        return ourInstance;
    }

    private MySingleTon() {
    }

    public void stMethod(){
        System.out.println("Responding from single ton class!");
    }

}
