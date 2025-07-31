package Practice_inheritance.FST;
public abstract class Shape{
    protected String name;
    public Shape(String name){
        this.name = name;
    }

    public abstract  double area();
    public void printArea(){
        System.out.println(name + "의 넓이 : "+ area());
    }


}

