package Ch01_variable_operator;
import java.util.*;
public class Arithmetic01 {
    public static void main(String[] args) {

        int x,y;
// ctrl+ d 복사


        System.out.println("Press x");
        Scanner sc1 = new Scanner(System.in) ;
        System.out.println("Press y");
        Scanner sc2 = new Scanner(System.in) ;
        x=sc1.nextInt();
        y=sc2.nextInt();
        System.out.println("plus : "+(x+y));
        System.out.println("minus : "+(x-y));
        System.out.println("cross : "+(x*y));
        System.out.println("divide : "+(x/y));
        System.out.println("else : "+(x%y));
        System.out.println("동일라인에서 곱셈, 나눗셈이 먼저 실행");
        System.out.println("소괄호는 연산 순서를 변경할수 있다.");
        System.out.println("데이터 타입이 다른 경우 큰 타입으로 변경 후 연산");

        System.out.println(14/5.0);

        int z = 5 ;
//복합 대입 연산자를 이용하여 3을 누적 시킵니다.
        z += 3 ; //x = x + 3 ;
        System.out.println("x : " +  z);//8
        z *= 4 ;
        System.out.println("x : " +  z);//32
        z %= 5 ;
        System.out.println("x : " +  z);//2
        z -= 1 ;
        System.out.println("x : " +  z);//1
        z += 7 ;
        System.out.println("x : " +  z);//8


    }
}
