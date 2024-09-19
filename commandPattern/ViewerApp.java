package commandPattern;

public class ViewerApp {
    public static void main(String[] args) {
        Tv tv = new Tv();
        Lights light = new Lights();
        Thermostat thermostat = new Thermostat();
        MusicPlayer mp = new MusicPlayer();

        RemoteControl rc = new RemoteControl();

        Command TvOn = new TvOn(tv);
        Command TvOff = new TvOff(tv);

        Command lightsOn = new LightsOn(light);
        Command increaseBrightness = new IncreaseBrightness(light);
        Command decreaseBrightness = new DecreaseBrightness(light);
        Command lightsOff = new LightsOff(light);

        Command thermostatOn = new ThermostatOn(thermostat);
        Command increaseTemp = new IncreaseTemp(thermostat);
        Command decreaseTemp = new DecreaseTemp(thermostat);
        Command thermostatOff = new ThermostatOff(thermostat);

        Command musicPlay = new MusicPlay(mp);
        Command increaseVolume = new IncreaseVolume(mp);
        Command decreaseVolume = new DecreaseVolume(mp);
        Command musicStop = new MusicStop(mp);



        rc.setCommand(TvOn);
        System.out.println(rc.clickButton());
        rc.setCommand(TvOff);
        System.out.println(rc.clickButton());


        rc.setCommand(lightsOn);
        System.out.println(rc.clickButton());
        rc.setCommand(increaseBrightness);
        System.out.println(rc.clickButton());
        rc.setCommand(decreaseBrightness);
        System.out.println(rc.clickButton());
        rc.setCommand(lightsOff);
        System.out.println(rc.clickButton());

        
        rc.setCommand(thermostatOn);
        System.out.println(rc.clickButton());
        rc.setCommand(increaseTemp);
        System.out.println(rc.clickButton());
        rc.setCommand(decreaseTemp);
        System.out.println(rc.clickButton());
        rc.setCommand(thermostatOff);
        System.out.println(rc.clickButton());


        rc.setCommand(musicPlay);
        System.out.println(rc.clickButton());
        rc.setCommand(increaseVolume);
        System.out.println(rc.clickButton());
        rc.setCommand(decreaseVolume);
        System.out.println(rc.clickButton());
        rc.setCommand(musicStop);
        System.out.println(rc.clickButton());
    }
}