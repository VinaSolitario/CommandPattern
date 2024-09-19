package commandPattern;

public class IncreaseVolume implements Command {
    private MusicPlayer mp;

    public IncreaseVolume(MusicPlayer mp) {
        this.mp = mp;
    }

    @Override
    public String execute() {
        return mp.increase();
    }
}