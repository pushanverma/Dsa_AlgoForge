import java.util.*;

//-----------------------------------MULTI-LEVEL INHERITANCE EXAMPLE(THROUGH INTERFACES)------------------------------------------

interface Camera {

    public void clickPhoto();

    public void recordVideo();

}

interface MusicPlayer {

    public void playMusic();

    public void stopMusic();

}

interface Phone {

    public void makeCall();

    public void endCall();

}

class SmartPhone implements Camera, Phone, MusicPlayer {

    public void clickPhoto() {
        System.out.println("Clicking photo from Camera ");
    }

    public void recordVideo() {
        System.out.println("Recording video from Camera ");

    }

    public void playMusic() {
        System.out.println("Playing music from Player ");

    }

    public void stopMusic() {
        System.out.println("Stopping music from Player ");

    }

    public void makeCall() {
        System.out.println("Make a call from phone");
    }

    public void endCall() {
        System.out.println("End a call from phone");
    }

}

public class InheritanceExample4 {

    public static void main(String[] args) {

        SmartPhone s = new SmartPhone();

        s.makeCall();
        s.endCall();

        s.clickPhoto();
        s.recordVideo();

        s.playMusic();
        s.stopMusic();

    }

}
