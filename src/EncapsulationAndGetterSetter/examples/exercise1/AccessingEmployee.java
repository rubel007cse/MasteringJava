package EncapsulationAndGetterSetter.examples.exercise1;

/**
 * Created by mosharrofrubel on 1/15/17.
 */
public class AccessingEmployee {

    public static void main(String[] a){

        Employee obj = new Employee();

        obj.setEmp_name("Ruhul Amin");
        obj.setAge(45);
        obj.setSalary(35500);


        System.out.println("Name: "+obj.getEmp_name());
        System.out.println("Age: "+obj.getAge());
        System.out.println("Salary: "+obj.getSalary());
    }

}
