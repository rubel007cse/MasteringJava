package EncapsulationAndGetterSetter.examples.example1;

/**
 * Created by mosharrofrubel on 1/15/17.
 */
public class Employee {

    private String emp_name;
    private int age;
    private int salary;

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
