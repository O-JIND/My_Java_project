package Practice_inheritance.Remote;
import java.util.*;
public class AirConditioner extends  Appliance implements  RemoteControl {
    public AirConditioner(String brand) {
        super(brand);
    }
    Scanner sc = new  Scanner(System.in);
    int r=sc.nextInt();
    @Override
    public void powerOn() {
        if(r == 1){
            System.out.println("에어컨이 켜집니다.");
        }
    }

    @Override
    public void powerOff() {
        if(r != 1){
            System.out.println("에어컨이 꺼집니다.");
        }
    }
}
