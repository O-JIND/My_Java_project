package Practice_inheritance.Remote;

public class Run {
    public static void main(String[] args) {
        Appliance tv = new TV("SAMSUNG");
        Appliance ac = new AirConditioner("LG");


        tv.printInfo();
        ((TV)tv).powerOff();
        ac.printInfo();
        ((AirConditioner) ac).powerOn();


    }
}
