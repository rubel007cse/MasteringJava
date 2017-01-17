package UnderstandingClassAndObject.exercises.exercise1;

/**
 * Created by mosharrofrubel on 1/17/17.
 */
public class MyClass {

    // this is a constructor
    public MyClass() {
    }

    public static void main(String[] args){

        MyClass mc = new MyClass();
        mc.myMethod();
    }


    public void myMethod(){
        System.out.println("This is a method");
    }

}
