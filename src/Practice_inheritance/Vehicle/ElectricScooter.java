package Practice_inheritance.Vehicle;

public class ElectricScooter extends Vehicle implements Chargeable {
    public ElectricScooter(String name) {
        super(name);
    }
    @Override
    public void move() {
        System.out.println(name+"가 조용히 달립니다..");
    }
    @Override
    public void charge() {
        System.out.println("스쿠터를 충전 중입니다.");
    }
}
