package JavaConstructor;

/**
 * Created by mosharrofrubel on 12/20/16.
 */
public class Students {

    String name;

    Students(String s){
        name = s;
    }

    public void showing(){
        System.out.println("Name of student is : "+name);
    }

    public static void main(String[] agrs){

        Students obj = new Students("Ayat");
        obj.showing();

    }

}
