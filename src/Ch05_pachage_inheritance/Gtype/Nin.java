package Ch05_pachage_inheritance.Gtype;

public class Nin extends  Gtype {
    public Nin(String name, String title, double price) {
        super(name, title, price);
    }
    public void print(){
        super.printinfo();
        System.out.println("2번째");

    }
}
