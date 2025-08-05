package Ch05_pachage_inheritance.Mybeverage;

public class Beverage04 {
    private String name;
    private int price;
    public Beverage04(){}

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    //메소드 은닉화 : 오버라이딩 시 본의 아니게 super class의 메소드가 숨겨지는 현상을 일컫는 일입니다.
//@  annotation
    @Override
    public String toString() {
        String msg = "품명 : " + this.name + ", 단가 : "+ this.price ;
        return msg;
    }

    public void showinfo(){
        System.out.printf("|  이름 : %s  |  단가 : %d  |\n",this.name , this.price);

    }


    public Beverage04(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
