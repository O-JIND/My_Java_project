package Ch06_abstract_interface.myshape.cartest;

public class Grandeur extends  Car {
    private String remark;
    private  double fuel;

    public Grandeur(String name, int price, String remark,Key key, double fuel) {
        super(name, price,key);
        this.remark = remark;
        this.fuel = fuel;
    }

    public void print(){
        dis();
        System.out.println(remark + fuel);
    }




}