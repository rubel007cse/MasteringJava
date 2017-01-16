package JavaAbstraction.exercise2;

/**
 * Created by mosharrofrubel on 1/16/17.
 */
public abstract class FacebookLife {

    abstract void profile();
    abstract void timeline();
    abstract void home();

    void status(){
        System.out.println("You can put status here!");
    }

    void like(){
        System.out.println("You can like from here!");
    }

    void comment(){
        System.out.println("You can put comments from here!");
    }

}
