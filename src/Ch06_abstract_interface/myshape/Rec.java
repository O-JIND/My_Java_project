package Ch06_abstract_interface.myshape;

public class Rec extends Shape{
    private double width;
    private double height;

    public Rec(String linecolor, String fillcolor, double width, double height) {
        super(linecolor, fillcolor);
        this.width = width;
        this.height = height;
    }



    @Override
    public double area(){
        double area = width*height;
        return area;
    }
 @Override
    public double around(){
        double around =2*(width+height);
        return around;
    }






}

