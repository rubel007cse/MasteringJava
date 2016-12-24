package TestingJavaException;

/**
 * Created by mosharrofrubel on 12/24/16.
 */
public class MultipleCatch {

    public static void main(String[] args){

        try{
            double dub[]=new double[10];
            System.out.println(dub[50]= 100/0);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception is: "+e);
        }
        catch(ArithmeticException e){
            System.out.println("Exception is: "+e);
        }
        catch(Exception e){
            System.out.println("Exception is: "+e);
        }

        System.out.println("Moving forward..");
    }

}
