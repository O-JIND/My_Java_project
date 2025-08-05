package Ch05_pachage_inheritance.animalpkg01;

public class Eagle01 extends Animal01{
    private int wing;
    public Eagle01(String name, String habitat, double lifespan, double speed) {
        super(name, habitat, lifespan, speed);
        wing=2;
    }

    public void print(){
        super.spec();
        System.out.println("날개 개수 : "+wing);
    }

    public void fly(){
        System.out.println("독수리는 난다.");
        System.out.println();
    }


}
