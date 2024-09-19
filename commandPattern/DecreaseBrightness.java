package commandPattern;

public class DecreaseBrightness implements Command {
    private Lights lights;

    public DecreaseBrightness(Lights lights) {
        this.lights = lights;
    }

    public String execute() {
        return lights.decrease();
    }
}