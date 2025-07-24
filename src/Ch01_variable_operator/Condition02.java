package Ch01_variable_operator;
import java.util.*;
public class Condition02 {
    public static void main(String[] args) {

        /*int a=7;
        String result;
        System.out.println("Press any int number");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        result = a>=b? "Yes": " NO";
        System.out.println("a >= b? "+result);*/


        //숫자 7은 홀수
        System.out.println("1~100 사이의 숫자를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int su = sc.nextInt();
        int siu = sc.nextInt();
        String set = su % 2 == 1 ? "입력값은 홀수" : "입력값은 짝수";
        String set2 = siu >= 65 ? "합격" : "불합격";

        System.out.println(set);
        System.out.println(set2);


    }
}
