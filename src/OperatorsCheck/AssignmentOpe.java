package OperatorsCheck;

/**
 * Created by mosharrofrubel on 12/22/16.
 */
public class AssignmentOpe {

    public static void main(String[] args){

        int i1 = 12;
        int j1 = 5;

        int i2 = 12;
        int j2 = 5;

        int i3 = 12;
        int j3 = 5;

        int i4 = 12;
        int j4 = 4;

        int i5 = 12;
        int j5 = 5;

        i1 += j1;
        System.out.println("i1+=j1 : "+i1);

        i2 -= j2;
        System.out.println("i2-=j2 : "+i2);

        i3 *= j3;
        System.out.println("i3*=j3 : "+i3);

        i4 /= j4;
        System.out.println("i4/=j4 : "+i4);

        i5 %= j5;
        System.out.println("i5%=j5 : "+i5);


        int i7 = 30;
        System.out.println(i7<<2);

    }

}
