package patterns.oreilly.command.model;

public class Stereo {
    public void on() {
        System.out.println("Stereo on");
    }

    public void off() {
        System.out.println("Stereo off");
    }

    public void setVolume(int volume) {
        System.out.println("Volume set to " + volume);
    }

    public void setCd() {
        System.out.println("Set CD");
    }
}
