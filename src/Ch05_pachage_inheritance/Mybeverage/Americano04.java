package Ch05_pachage_inheritance.Mybeverage;

public class Americano04 extends Beverage04 {
    private double waterAmount;

    public Americano04(String name, int price, double waterAmount) {
        super(name, price);
        this.waterAmount = waterAmount;
    }
    @Override
    public String toString() {
        String msg = " 물양 : " +this.waterAmount + "ml";
        return super.toString() + msg;
    }
    public void sipAmericano(){

        System.out.println("sipsipsiva");

    }
}
