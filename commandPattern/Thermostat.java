package commandPattern;

public class Thermostat {

    public String switchOn() {
        return "Thermostat is switched-on!";
    }

    public String switchOff(){
        return "Thermostat is switched-off";
    }

    public String increase () {
        return "Temperature increased.";
    }

    public String decrease () {
        return "Temperature decreased.";
    }
}