package Ch05_pachage_inheritance.Mybeverage;


public class InheTest04 {
    public static void main(String[] args) {


        Beverage04 Amerca = new Americano04("americano",4000, 250);



        Amerca.showinfo();//슈퍼 클래스 내에 있는 메소드는 상속 개념에 의하여 접근 가능
        if(Amerca instanceof Americano04){
            ((Americano04) Amerca).sipAmericano();

        }
    }
    }

