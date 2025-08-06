package Ch06_abstract_interface.myshape.BeverageTest;

public class BeverageMain {
    public static void main(String[] args) {
        Beverage[] be = {
            new  Americano("Americano",5000),
            new Espresso("Espresso",4500),
            new Latte("Latte",7000)
        };


        for(Beverage s : be){
            s.showData();
            s.drink();
            s.make();
            System.out.println("+++++++++++++++++++++++++++");
        }

    }
}
