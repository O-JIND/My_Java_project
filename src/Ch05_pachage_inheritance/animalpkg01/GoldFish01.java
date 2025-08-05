package Ch05_pachage_inheritance.animalpkg01;

public class GoldFish01 extends Animal01{
    private int gill;
    public GoldFish01(String name, String habitat, double lifespan, double speed) {
        super(name, habitat, lifespan, speed);
        gill = 2;
    }

    public void print(){
        super.spec();
        System.out.println("아가미 개수 : " + gill);
    }
    public void swim(){
        System.out.println("금붕어는 뻐끔뻐끔");
        System.out.println();
    }

}
