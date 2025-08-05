package Problem_Practice.SM;
import  java.util.*;
public class SmartTV extends SmartDevices implements SmartDevice,Controllable {
    public SmartTV(String name) {
        super(name);
    }

    @Override
    public void control() {
        Scanner sc  = new Scanner(System.in);
        int AA = sc.nextInt();


        if(AA==1){
            turnOn();
        }else {
            turnOff();
        }
    }

    @Override
    public void turnOn() {
        System.out.println( getName() + " 전원이 켜집니다.");
    }

    @Override
    public void turnOff() {
        System.out.println(getName() + " 전원이 꺼집니다.");
    }
}
