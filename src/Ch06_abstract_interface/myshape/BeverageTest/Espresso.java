package Ch06_abstract_interface.myshape.BeverageTest;

public class Espresso extends Beverage{
    Espresso(String name,double price){
        super(name,price);

    }

    @Override
    public void drink() {
        System.out.println("써");
    }

    @Override
    public void make() {
        System.out.println("샷을 추출한다.");
    }

}
