package Ch02_control_statement;
import java.util.*;
public class SayHello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("멘트 :");
        String men = sc.next();
        System.out.print("반복 횟수 :");
        int num = sc.nextInt();
        for (int i=0;i<num;i++){
            System.out.println(men);
        }

    }
}
