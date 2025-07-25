package Ch02_control_statement;
import java.util.*;
public class If03 {
    public static void main(String[] args) {
        System.out.println("Press Integer Num");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if (A%3==0){
            double B=Math.pow(A,2);
            System.out.println((int)B);
        }
        else{
            A+=5;
            System.out.println(A);
        }


    }
}
