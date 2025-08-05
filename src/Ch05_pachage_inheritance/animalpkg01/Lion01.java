package Ch05_pachage_inheritance.animalpkg01;

public class Lion01 extends Animal01{
    private  int leg;
    public Lion01(String name, String habitat, double lifespan, double speed) {
        super(name, habitat, lifespan, speed);
        leg = 4;
    }

    public void print(){
        super.spec();
        System.out.println("다리 개수 : "+leg);
    }

public void run(){
    System.out.println("사자는 뛴다.");
    System.out.println();
}

}
