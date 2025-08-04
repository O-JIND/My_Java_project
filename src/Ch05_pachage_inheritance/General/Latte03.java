package Ch05_pachage_inheritance.General;

public class Latte03 extends Beverage03 {
    private String milktype;
    public Latte03(){

        super("Espresso",4000);
        milktype = "Oat milk";
    }

    public void printInfo(){
        super.showInfo();
        System.out.println("변경된 우유 : " +milktype);
    }

}
