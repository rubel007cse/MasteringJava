package TestingJavaException.exercise;

import TestingJavaException.UsingThrowsException;

import java.io.IOException;

/**
 * Created by mosharrofrubel on 1/17/17.
 */
public class ThrowingExcp {


    public static void main(String[] args) {

        try{
            ThrowingExcp object = new ThrowingExcp();
            object.testMethod();

        } catch(Exception e){
            System.out.println("Handled!");
        }

        System.out.println("Moving forward...");

    }


    public void testMethod()throws ArithmeticException {
        throw new ArithmeticException("Arithmetic exception occurred");
    }



}
