package Ch05_pachage_inheritance.General;

public class Americano03 extends Beverage03 {
    private int add_W;
    public Americano03(){
        super("americano",4000);
        add_W = 300;
    }


    public void printInfo(){
        super.showInfo();
        System.out.println("물의 양 : " +add_W);
    }
}
