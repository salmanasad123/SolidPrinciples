package interfaceSeggregation;

public class VlcMediaPlayer implements VideoMediaPlayer {

    @Override
    public void playAudio() {
        System.out.println("Playing audio ..........");

    }

    @Override
    public void playVideo() {
        System.out.println("Playing video ..........");

    }
}
