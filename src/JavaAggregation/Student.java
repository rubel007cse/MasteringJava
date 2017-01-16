package JavaAggregation;

/**
 * Created by mosharrofrubel on 12/23/16.
 */
public class Student {

    String name ;
    int id;
    // We used object from 'Subjects' class, this is aggregation
    Subjects s;

    // declaring a method to show a student
    public void show_student(){
        name = "Borno";
        id = 1;
        s = new Subjects();

        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Subject 1: "+s.bangla);
        System.out.println("Subject 2: "+s.english);

    }


    public static void main(String[] arg){

        Student student = new Student();
        student.show_student();

    }


}
