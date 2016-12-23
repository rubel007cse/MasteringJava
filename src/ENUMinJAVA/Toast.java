package ENUMinJAVA;

/**
 * Created by mosharrofrubel on 12/23/16.
 */


public class Toast {

    public enum TOAST{
        LENGTH_LONG, LENGTH_SHORT
    }

    public static void makeText(String c, String s, TOAST t){
        System.out.println("Toasting: \nContext: "+c+"\nDemo Text: "+s+"\n"+"Length: "+t);
    }

}
