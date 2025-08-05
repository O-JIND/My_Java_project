package Ch05_pachage_inheritance.Mybeverage;


public class InheTest04 {
    public static void main(String[] args) {


        Beverage04 beverage01 = new Americano04("americano",4000, 250);
        beverage01.showinfo();//슈퍼 클래스 내에 있는 메소드는 상속 개념에 의하여 접근 가능
        if(beverage01 instanceof Americano04){
            ((Americano04) beverage01).sipAmericano();
        }
        Beverage04 beverage02 = new Espresso04("에스프레소",5000,2);
        Espresso04 espresso =(Espresso04) beverage02;
        Beverage04 beverage03 = new Latte04("라떼",6000,"아몬드 우유");
        Beverage04[] beverage = {
                beverage01,
                new Espresso04("에스프레소",5000,2),
                new Latte04("라떼",6000,"아몬드 우유"),
        };
        System.out.println(beverage02.toString());

        for(int i =0 ; i<beverage.length;i++){
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println(beverage[i]);
            /*if(beverage[i] instanceof Americano04){
                Americano04 x = (Americano04) beverage[i];
                x.sipAmericano();
            }else if(beverage[i] instanceof Espresso04){
                Espresso04 y =(Espresso04) beverage[i];
                y.drinkEspresso();
            } else if (beverage[i] instanceof Latte04) {
                Latte04 z =(Latte04)beverage[i];
                z.enjoyLatte();
            }else {
                System.out.println("nothing in here");
            }*/
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");




    }
    }

