package MySwitchStatement;

/**
 * Created by mosharrofrubel on 12/6/16.
 */
public class LearningSwitchStatement {
    public static void main(String[] args){

        int absent = 2;
        switch(absent) {
            case 0 :
                System.out.println("You missed no class!");
                break;
            case 1 :
                System.out.println("You missed 1 class!");
                break;
            case 2 :
                System.out.println("You missed 2 classes!");
                break;
            case 3 :
                System.out.println("You missed 3 classes!");
            default :
                System.out.println("Invalid Input!");
        }

        // 'break' keyword helps to break the loop. It stops checking after finding match.
    }
}
