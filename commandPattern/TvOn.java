package commandPattern;

public class TvOn implements Command {

    private Tv tv;
    public TvOn(Tv tv){
        this.tv = tv;
    }
    @Override
    public String execute() {
        return tv.switchOn();
    }
}