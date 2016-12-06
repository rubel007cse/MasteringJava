package TestingJavaException;

import java.io.IOException;

/**
 * Created by mosharrofrubel on 12/6/16.
 */
public class UsingThrowsException {
    public static void main(String[] args) {

        try{
            UsingThrowsException object = new UsingThrowsException();
            object.my_cool_method();
        } catch(Exception e){
            System.out.println("Bingo! I handled the thrown exception here!");
        }

        System.out.println("Code working fine ...");

    }


    public void my_cool_method()throws IOException{
        throw new IOException("Im throwing an error from here!");
    }



    /*

    1. The throw keyword will allow you to throw an exception (which will break
    the execution flow and can be caught in a catch block).

    2. The throws keyword in the method prototype is used to specify that your method
    might throw exceptions of the specified type.
    It's useful when you have checked exception (exception that you have to handle) that
    you don't want to catch in your current method.

    */
}


