package Ch05_pachage_inheritance.Mybeverage;

public class Latte04 extends Beverage04{
        private String milktype;

    public Latte04(String name, int price, String milktype) {
        super(name, price);
        this.milktype = milktype;
    }
    public void enjoyLatte(){

        System.out.println("Latte 는 말이야");


    }

}
