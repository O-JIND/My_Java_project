package Ch04_create_class_package;

public class ShapeAreaMain {
    public static void main(String[] args) {

        ShapeArea obj = new ShapeArea() ;

        //메소드 오버로딩
        obj.area( 10 ) ; // 원
        obj.area( 5, 10 ) ; // 사각형
        obj.area( 5, 15, 10 ) ; // 사다리꼴



    }
}
