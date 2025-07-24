package Ch01_variable_operator;
import java.util.*;
public class TernaryOperator {
    public static void main(String[] args) {

        int a =3 , b=5;
        int result = 0;
        result = Math.abs(b-a);

        System.out.println(result);

        int v =  a>=b ? a-b : b-a;//
        System.out.println(v);

        Scanner sc1 = new Scanner(System.in);
        int sc = sc1.nextInt();
        int Rdn = (int)(Math.random()*1000);
        int res = sc>=Rdn? sc:Rdn ;

        res = sc<Rdn?Rdn:sc;
        System.out.println(res);
    }
}
