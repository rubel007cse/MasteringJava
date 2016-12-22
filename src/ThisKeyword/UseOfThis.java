package ThisKeyword;

/**
 * Created by mosharrofrubel on 12/22/16.
 */
public class UseOfThis {

    int i1;
    int i2;

    public int getI1() {
        return i1;
    }

    public void setI1(int i1) {
        // DIDN"T use this here
        i1 = i1;
    }

    public int getI2() {
        return i2;
    }

    public void setI2(int i2) {
        this.i2 = i2;
    }

    public static void main(String[] args){

        UseOfThis ut = new UseOfThis();
        ut.setI1(5);
        ut.setI2(10);

        // now printing all values
        System.out.println(ut.getI1());
        System.out.println(ut.getI2());
    }
}
