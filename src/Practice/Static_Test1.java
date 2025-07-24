package Practice;

public class Static_Test1 {
    int a;
    static String s;

    public static void main(String[] args) {

        s= "자바의 꿈";
        Static_Test1 st1 = new Static_Test1();

        //a=1000;
        st1.a=1000;
        System.out.println("s : " + s);
    }
}
