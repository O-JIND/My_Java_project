package Ch06_abstract_interface.myshape.BeverageTest;

public class Latte extends Beverage{
    Latte(String name,double price){
        super(name,price);

    }
    @Override
    public void drink() {
        System.out.println("꿀꺽");
    }

    @Override
    public void make() {
        System.out.println("에스프레소 2샷을 추출한다.");
        System.out.println("얼음을 가득채운 잔에 우유를 채우고 그위에 샷을 붓는다.");
    }


}
