package Ch05_pachage_inheritance.Gtype;

public class Ps5 extends  Gtype {
    public Ps5(String name ,String title,double price){
        super(name,title,price);
    }
    public void print(){
        super.printinfo();
        System.out.println("1번째");

    }
}
