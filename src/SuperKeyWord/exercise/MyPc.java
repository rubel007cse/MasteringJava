package SuperKeyWord.exercise;

/**
 * Created by mosharrofrubel on 1/17/17.
 */
public class MyPc extends PcOfMyBrother {

    public MyPc(){
        super();
    }

    public MyPc(String s){
        System.out.println(s+"I'm also using my pc!");
    }


    public static void main(String[] args){

        MyPc myPc1 = new MyPc();


    }



    }
