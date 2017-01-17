package UnderstandingClassAndObject.exercises.exercise2;

/**
 * Created by mosharrofrubel on 1/17/17.
 */
public class MPProperties {

    public boolean initializePlayer(){
        return true;
    }

    public void play(){
        System.out.println("Song will be played from this method");
    }

    public void pause(){
        System.out.println("You can pause from here");
    }

    public void stop(){
        System.out.println("You can stop from here!");
    }

    public void next(){
        System.out.println("You can go next from here!");
    }

    public void prev(){
        System.out.println("You can come to previous from here!");
    }

    public int totalSongs(){
        int songs = 200;
        return songs;
    }

    public String currentSong(){
        String c_song = "Aj ei akash..";
        return c_song;
    }


}
