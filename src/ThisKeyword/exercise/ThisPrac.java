package ThisKeyword.exercise;

/**
 * Created by mosharrofrubel on 1/17/17.
 */
public class ThisPrac {

    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public static void main(String[] args){

        ThisPrac thisPrac = new ThisPrac();
        thisPrac.setI(10);
        System.out.println("Value of i is: "+thisPrac.getI());

    }

}
