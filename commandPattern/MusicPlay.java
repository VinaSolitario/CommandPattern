package commandPattern;

public class MusicPlay implements Command {
    private MusicPlayer mp;

    public MusicPlay (MusicPlayer mp) {
        this.mp = mp;
    }

    @Override
    public String execute() {
        return mp.play();
    }
}