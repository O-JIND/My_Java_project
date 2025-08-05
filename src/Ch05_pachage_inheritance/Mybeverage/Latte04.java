package Ch05_pachage_inheritance.Mybeverage;

public class Latte04 extends Beverage04{
        private String milktype;

    public Latte04(String name, int price, String milktype) {
        super(name, price);
        this.milktype = milktype;
    }
    @Override
    public String toString() {
        String msg = " 우유 종류 : " +milktype ;
        return super.toString() + msg;
    }
    public void enjoyLatte(){

        System.out.println(super.getName()+"는 말이야");


    }

}
