package Ch05_pachage_inheritance.Mybeverage;

public class Beverage04 {
    private String name;
    private int price;
    public Beverage04(){}

    public void showinfo(){
        System.out.printf("이름 : %s 단가 : %d \n",this.name , this.price);

    }



    public Beverage04(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
