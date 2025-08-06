package Ch06_abstract_interface.myshape;

public class Tri extends Shape{
    private double width;
    private double height;

    public Tri(String linecolor, String fillcolor, double width, double height) {
        super(linecolor,fillcolor);
        this.width = width;
        this.height = height;

    }



    @Override
    public double area(){
        double area = width*height/2;
        return area;
    }

        @Override
    public double around(){//직각삼각형 가정
        double around =Math.sqrt(Math.pow(width,2)+Math.pow(height,2)) +width+height;
        return around;
        }




}
