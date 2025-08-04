package Ch05_pachage_inheritance.Gtype;

public class Gtype {
    private String name,title;
    private double price;
    public Gtype(String name, String title, double price){
        this.name = name;
        this.title = title;
        this.price = price;
    }

    public void printinfo(){
        System.out.printf("%s는 %s이 유명하고 %,.1f원이다.",name,title,price);

    }
}
