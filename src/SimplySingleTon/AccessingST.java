package SimplySingleTon;

/**
 * Created by mosharrofrubel on 1/18/17.
 */
public class AccessingST {

    public static void main(String[] args){

        // uncomment the below line to see the result
       //  MySingleTon mySingleTon = new MySingleTon();


        // accessing single ton for once
        MySingleTon accessingST = MySingleTon.getInstance();
        accessingST.stMethod();

    }

}
