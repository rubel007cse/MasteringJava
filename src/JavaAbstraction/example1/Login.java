package JavaAbstraction.example1;

/**
 * Created by mosharrofrubel on 1/16/17.
 */
public class Login {
    public static void main(String[] args){

        SocialLife socialLife;

        socialLife = new Facebook();
        String a = socialLife.socialSites();
        System.out.println(a);

        socialLife = new Twitter();
        String b = socialLife.socialSites();
        System.out.println(b);

    }
}
