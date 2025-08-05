package Practice_inheritance.Remote;

public class TV extends  Appliance implements  RemoteControl {
    public TV(String brand) {
        super(brand);
    }

    @Override
    public void powerOn() {

    }

    @Override
    public void powerOff() {
        System.out.println( "1시간 뒤에 꺼짐예약");
    }
}
