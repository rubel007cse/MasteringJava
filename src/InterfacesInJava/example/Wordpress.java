package InterfacesInJava.example;

/**
 * Created by mosharrofrubel on 1/16/17.
 */
public class Wordpress implements JarvisTheme {

    public static void main(String[] o){

        Wordpress wp = new Wordpress();
        wp.themeAuthor();
        wp.wordpressVersion();
        wp.themeName();

    }

    @Override
    public void themeName() {
        System.out.println("Theme Name: Jarvis");
    }

    @Override
    public void wordpressVersion() {
        System.out.println("WP Verions: 4.3");

    }

    @Override
    public void themeAuthor() {
        System.out.println("Author: Unknown");

    }
}
