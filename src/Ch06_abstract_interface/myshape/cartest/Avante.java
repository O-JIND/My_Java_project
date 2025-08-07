package Ch06_abstract_interface.myshape.cartest;

public class Avante extends  Car{
    private String comment;
    Key key;

    public Avante(String name, int price,Key key, String comment) {
        super(name, price,key);
        this.comment = comment;
    }

    public void print(){
        dis();
        System.out.println("Maker : " + comment);
    }


    @Override
    public String toString() {
        String msg = " 코멘트 :  " + comment;
        return super.toString() + msg;
    }
}
