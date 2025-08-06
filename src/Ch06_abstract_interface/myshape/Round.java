package Ch06_abstract_interface.myshape;

public class Round extends Shape{
    private double radius;
    private double x;
    private double y;
    private final double pi = 3.141592;
    public Round(String linecolor, String fillcolor, double radius, double x, double y) {
        super(linecolor, fillcolor);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public double area(){
        double area = Math.pow(radius,2)*pi;
        return area;

    }


    @Override
    public double around(){
        double around =2* radius+pi;
        return around;
    }





}
