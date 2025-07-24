package Ch01_variable_operator;

public class PlusMinus01 {
    public static void main(String[] args) {
        int a =10, b=20, c;


        ++a;//11
        b--;//19
        c= ++a + b--;//31 , b=18

        System.out.println(c);
        System.out.println(b);
        System.out.println(a);

    }
}
