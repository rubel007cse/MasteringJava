package InheritancePro.example2;

/**
 * Created by mosharrofrubel on 1/15/17.
 */
public class Lecturer extends Department {

    public static void main(String[] k){

        Department obj = new Lecturer();
        Lecturer obj2 = new Lecturer();

        obj.salary();
        obj.transport();

        obj2.salary();
        obj2.transport();

    }

}
