package Ch05_pachage_inheritance.General;

public class Espresso03 extends Beverage03 {
    private int shot;
    public Espresso03(){
        super("Espresso",6000);
        shot = 2;
    }
    public void printInfo(){
        super.showInfo();
        System.out.println("샷 추가 : " +shot);
    }
}
