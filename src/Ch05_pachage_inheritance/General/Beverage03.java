package Ch05_pachage_inheritance.General;

public class Beverage03 {
    private String name;
    private int price;

    public Beverage03(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public void showInfo(){
        System.out.println("이름 : " + name +"\n"+"가격 : "+price);
    }

}
