package Ch06_abstract_interface.myshape;

import Practice_inheritance.FST.Rectangle;

public class ShapeMain {
    public static void main(String[] args) {
        Shape[] SH = {
                new Tri("yellow","black",15.0,10.0),
                new Rec("red","green",20.0,10.0),
                new Round("","",2,1,2)


        };

        for (Shape s : SH){
            System.out.println(s.area());
            System.out.println(s.around());
        }


        // Anonymous Inner Type
    Shape sample= new Shape("","" ) {
        @Override
        double area() {
            return 0;
        }

        @Override
        double around() {
            return 0;
        }
    };

        for(int i = 0 ; i < 100; i++){
            sample.draw();
        }

        Shape sample02 = new Rec("red","green",20.0,10.0);
        sample02.draw();
        sample02.around();
    }


}
