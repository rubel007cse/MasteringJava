package MyAccessModifiers.PackageONE;

/**
 * Created by mosharrofrubel on 12/18/16.
 */
public class MyMobile {

    // private password method
    private int password() {
        return 44535;
    };

    protected void galary(){
        System.out.println("Showing galary pics..");
    }

    public static void main(String[] args){
        MyMobile myMobile = new MyMobile();

        // trying to access 'password' method
          myMobile.password();

    }



}
