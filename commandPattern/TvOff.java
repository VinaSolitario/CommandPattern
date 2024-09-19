package commandPattern;

public class TvOff implements Command {

    private Tv tv;
    public TvOff(Tv tv){
        this.tv = tv;
    }
    @Override
    public String execute() {
        return tv.switchOff();
    }
}