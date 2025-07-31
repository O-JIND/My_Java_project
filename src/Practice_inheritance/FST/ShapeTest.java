package Practice_inheritance.FST;

public class ShapeTest{
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4,6)
        };

        for(Shape s : shapes){
            s.printArea();
        }

    }
}
