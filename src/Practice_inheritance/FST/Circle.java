package Practice_inheritance.FST;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        super("원");
        this.radius = radius;

    }

    @Override
    public double area(){
        return Math.PI * Math.pow(radius,2);
    }

}

