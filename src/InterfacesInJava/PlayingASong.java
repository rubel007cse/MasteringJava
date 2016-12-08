package InterfacesInJava;

/**
 * Created by mosharrofrubel on 12/8/16.
 */
public class PlayingASong implements MyCoolMusicPlayer {
    public static void main(String[] arg){

        PlayingASong ps = new PlayingASong();

        // calling method
        ps.my_cool_method();

        // printing variable
        System.out.println("My Age is: " + MyCoolMusicPlayer.my_age);

    }


    @Override
    public void my_cool_method() {

        System.out.println("This method is overridden from interface");

    }

    // 'implements' keyword to use  a interface in a class.
}
