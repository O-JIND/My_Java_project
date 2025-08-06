package Ch06_abstract_interface.myshape.BeverageTest;

public abstract class Beverage {
    protected String name;
    protected  double price;

    public Beverage(String name,double price){
        this.name=name;
        this.price = price;
    }


    public final void showData(){

        System.out.println("이름 : "+ name+"가격 : " +price);


    }
    public abstract void drink();
    public abstract void make();



}
