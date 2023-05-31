package interfaceSeggregation;

//  Div Media player implements both audio and video

public class DivMediaPlayer implements VideoMediaPlayer {

    @Override
    public void playAudio() {
        System.out.println(" Playing audio ..........");
    }
    @Override
    public void playVideo() {
        System.out.println(" Playing video ..........");
    }

}
