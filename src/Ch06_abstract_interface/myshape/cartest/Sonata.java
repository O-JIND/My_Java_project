package Ch06_abstract_interface.myshape.cartest;

public class Sonata extends  Car {
    String maker;

    public Sonata(String name, int price,Key key, String maker) {
        super(name, price,key);
        this.maker = maker;
    }




    public void print(){
        dis();
        System.out.println("Maker : " + maker);
    }
}




