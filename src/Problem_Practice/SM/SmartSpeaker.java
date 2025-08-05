package Problem_Practice.SM;

public class SmartSpeaker  extends SmartDevices implements SmartDevice{


    public SmartSpeaker(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        System.out.println("전원 ON");
    }

    @Override
    public void turnOff() {
        System.out.println("전원 Off");
    }
}
