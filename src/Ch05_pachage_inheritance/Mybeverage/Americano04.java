package Ch05_pachage_inheritance.Mybeverage;

public class Americano04 extends Beverage04 {
    private double waterAmount;

    public Americano04(String name, int price, double waterAmount) {
        super(name, price);
        this.waterAmount = waterAmount;
    }
    public void sipAmericano(){

        System.out.println("sipsipsiva");

    }
}
