package SuperKeyWord;

/**
 * Created by mosharrofrubel on 12/23/16.
 */
public class AdamjeeSchool extends AdamjeeCollege {

    // invoking super class constructor
    public AdamjeeSchool(){
        // we'll invoke Constructor of College
        super();
    }


    public static void main(String[] args){

        // creating object
        AdamjeeSchool as = new AdamjeeSchool();
        as.showing();

    }

    int students = 1500;
    public void showing(){
        System.out.println("Students: "+super.students);
    }


}
