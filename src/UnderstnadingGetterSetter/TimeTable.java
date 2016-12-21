package UnderstnadingGetterSetter;

/**
 * Created by mosharrofrubel on 12/22/16.
 */
public class TimeTable {

    public static void main(String[] args){

        MyClock mc = new MyClock();
        mc.setTime("Current time is : 4:54 AM");

        String ct = mc.getTime();
        System.out.println(ct);
    }

}
