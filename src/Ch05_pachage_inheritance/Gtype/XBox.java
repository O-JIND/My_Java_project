package Ch05_pachage_inheritance.Gtype;

public class XBox extends  Gtype {
    public XBox(String name, String title, double price) {
        super(name, title, price);
    }
    public void print(){
        super.printinfo();
        System.out.println("3번째");

    }
}
