package Practice_inheritance.Vehicle;

public class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name+"가 이동중입니다.");
    }


}
