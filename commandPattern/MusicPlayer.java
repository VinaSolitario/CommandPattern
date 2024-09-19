package commandPattern;

public class MusicPlayer {
    
    public String play() {
        return "Playlist picked!";
    }

    public String stop() {
        return "Music is stopped.";
    }

    public String increase () {
        return "Volume increased.";
    }

    public String decrease () {
        return "Volume decreased.";
    }
}