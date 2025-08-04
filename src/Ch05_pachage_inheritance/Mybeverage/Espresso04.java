package Ch05_pachage_inheritance.Mybeverage;

public class Espresso04 extends Beverage04 {
    private int shotCount;

    public Espresso04(String name, int price, int shotCount) {
        super(name, price);
        this.shotCount = shotCount;
    }
    public void drinkEspresso(){

        System.out.println("WA HAHAHAH");
    }
}
