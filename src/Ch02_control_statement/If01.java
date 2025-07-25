package Ch02_control_statement;
import java.util.*;
public class If01 {
    public static void main(String[] args) {
        System.out.println("정수 한개 입력 : ");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if (A%2==0){
            System.out.println(A+"는 짝수입니다.");
        }
        else{
            System.out.println(A+ "는 홀수입니다.");
        }
        System.out.println("bull shit");
    }
}

