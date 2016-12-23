package MyAccessModifiers.PackageONE;

import MyAccessModifiers.PackageTWO.MyDiary;

/**
 * Created by mosharrofrubel on 12/18/16.
 */
public class MyHome {

    public static void main(String[] args){

        // this line means, creating class object.
        MyMobile myMobile = new MyMobile();

        // trying to access  PRIVATE 'password' method
        // remove comment sign from below to see the result
       //  myMobile.password();


        // trying to access PROTECTED 'galary' method
        myMobile.galary();


        // creating object of a class from other package class
        MyDiary md = new MyDiary();

        // tyring to access a protected method
        // remove comment sign to see the effect
        // md.poems();
        // md.stories();
        md.importantDates();

    }

}
