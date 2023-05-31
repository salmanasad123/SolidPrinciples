package interfaceSeggregation;

public class Main {

    public static void main(String[] args) {

        // The Interface Segregation Principle states that clients should not be forced to implement interfaces
        // they don't use. ISP splits interfaces that are very large into smaller and more specific ones so that
        // clients will only have to know about the methods that are of interest to them.

        // Don’t depend on things you don’t need. Interfaces containing methods that are not specific to it
        // are called polluted or fat interfaces. We should avoid them.

        // What the Interface Segregation Principle says is that your interface should not be bloated with methods
        // that implementing classes don’t require. For such interfaces, also called “fat interfaces”,
        // implementing classes are unnecessarily forced to provide implementations (dummy/empty) even
        // for those methods that they don’t need. In addition, the implementing classes are subject to
        // change when the interface changes. An addition of a method or change to a method signature
        // requires modifying all the implementation classes even if some of them don’t use the method.

        MediaPlayer mediaPlayer = null;

        /*mediaPlayer = new VlcMediaPlayer();
        mediaPlayer.playAudio();
        mediaPlayer.playVideo();*/

        // Now there is a need for launching a new Winamp player to play audio, but playing video is not
        // supported at this stage. Here, Winamp player is forced to depend upon interface members they do not use.
        // In this case, playVideo() method is not required

        /*mediaPlayer = new WinampMediaPlayer();
        mediaPlayer.playAudio();
        mediaPlayer.playVideo();*/

        // Let's refactor the code to make "good" design using the Interface Segregation Principle.

        VideoMediaPlayer videoMediaPlayer = new VlcMediaPlayer();
        videoMediaPlayer.playAudio();
        videoMediaPlayer.playAudio();

        mediaPlayer = new WinampMediaPlayer();
        mediaPlayer.playAudio();
    }
}
