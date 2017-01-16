package MyAccessModifiers.exercise.teachers;

import MyAccessModifiers.exercise.students.Student1;
import MyAccessModifiers.exercise.students.Student2;

/**
 * Created by mosharrofrubel on 1/17/17.
 */
public class Teacher1 {

    public static void main(String[] a){
        int r1 = Student1.roll;
        int r2 = Student2.roll;

        System.out.println("Roll 1 :"+r1);
        System.out.println("Roll 2 :"+r2);

        String dus = Teacher2.d;
        System.out.println("Boring from teacher 1: "+dus);

    }

}
