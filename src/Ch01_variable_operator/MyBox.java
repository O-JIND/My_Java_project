package Ch01_variable_operator;

public class MyBox {
    public static void main(String[] args) {

        double a,h,d,r,dia;
        a=10;
        h=5;
        d=a*h;
        r=2*(a+h);
        dia=Math.sqrt(Math.pow(a,2)+Math.pow(h,2));
        System.out.println("너비"+a);
        System.out.println("높이"+h);
        System.out.println("사각형의 넓이"+d);
        System.out.println("사각형의 둘레"+r);
        System.out.println("대각선의 길이"+dia);



    }
}
