package OperatorsCheck.exercise;

/**
 * Created by mosharrofrubel on 12/22/16.
 */
public class AssignmentExer {

    public static void main(String[] args){

        int r1 = 24;
        int s1 = 10;

        int r2 = 24;
        int s2 = 10;

        int r3 = 24;
        int s3 = 10;

        int r4 = 24;
        int s4 = 10;

        int r5 = 24;
        int s5 = 10;

        r1 += s1;
        System.out.println("i1+=j1 is "+r1);

        r2 -= s2;
        System.out.println("i2-=j2 is "+r2);

        r3 *= s3;
        System.out.println("i3*=j3 is "+r3);

        r4 /= s4;
        System.out.println("i4/=j4 is "+r4);

        r5 %= s5;
        System.out.println("i5%=j5 is "+r5);


        int r7 = 30;
        System.out.println(r7<<2);

    }

}
