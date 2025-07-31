package Ch04_create_class_package;

public class ShapeArea {
    final double pi = 3.14;

    public void area(double r){
        double ar = r*r*pi;
        System.out.println(ar);
    }

    public void area(double up,double down , double h) {
        double ar = (up+down)*h/2;
        System.out.println(ar);
    }
    public void area(double a,double b) {
        double ar = a * b;
        System.out.println(ar);

    }
}
