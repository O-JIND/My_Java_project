package Practice_inheritance.FST;
public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width,double height ){
        super("직사각형");
        this.width=width;
        this.height=height;
    }
    @Override
    public double area(){
        return  width * height;
    }


}
