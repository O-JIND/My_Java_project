package Ch02_control_statement;
import java.util.*;

public class Exam4_18 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i,j = sc.nextInt(),k;
        for (i =1; i<j+1;i++){
           k= (int)Math.pow(i,2);
            System.out.println(i+"의 제곱은 "+k+"입니다.");
        }

    }
}
