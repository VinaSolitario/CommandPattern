package commandPattern;

public class DecreaseVolume implements Command {
    private MusicPlayer mp;

    public DecreaseVolume(MusicPlayer mp) {
        this.mp = mp;
    }

    @Override
    public String execute() {
        return mp.decrease();
    }
}