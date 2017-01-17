package UnderstandingClassAndObject.exercises.exercise2;

/**
 * Created by mosharrofrubel on 1/17/17.
 */
public class PlayingSong {

    public static void main(String[] args){

        MPProperties musicPlayer = new MPProperties();

        boolean b = musicPlayer.initializePlayer();
        System.out.println("Initializing player: "+b);

        String song = musicPlayer.currentSong();
        System.out.println("Playing.. "+song);

        musicPlayer.play();
        musicPlayer.pause();
        musicPlayer.stop();
        musicPlayer.prev();
        musicPlayer.next();


        System.out.println("Total songs: "+musicPlayer.totalSongs());


    }

}
