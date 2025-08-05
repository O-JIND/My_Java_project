package Ch05_pachage_inheritance.Mybeverage;

public class Espresso04 extends Beverage04 {
    private int shotCount;

    public Espresso04(String name, int price, int shotCount) {
        super(name, price);
        this.shotCount = shotCount;
    }
    @Override
    public String toString() {
        String msg = " 샷 추가 : " +this.shotCount ;
        return super.toString() + msg;
    }
    public void drinkEspresso(){

        System.out.println("고소한 "+super.getName());
    }
}
