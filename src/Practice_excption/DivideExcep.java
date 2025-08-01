package Practice_excption;
import java.util.*;
public class DivideExcep {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자 : ");
        double first = sc.nextInt();
        System.out.println("두번째 숫자 : ");
        double second = sc.nextInt();
        try {
            double result = first / second;
            System.out.println("첫번째 숫자 : "+first);
            System.out.println("두번째 숫자 : " + second);
            System.out.printf("결과 값 : %,.3f\n",result);
        } catch (ArithmeticException e) {
            System.out.println("오류 : 0으로 나눌 수 없습니다.");
        }



    }

}



