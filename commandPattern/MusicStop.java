
package commandPattern;

public class MusicStop implements Command {
    private MusicPlayer mp;

    public MusicStop (MusicPlayer mp) {
        this.mp = mp;
    }

    @Override
    public String execute() {
        return mp.stop();
    }
}
