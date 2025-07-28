package Ch02_control_statement;
import java.util.*;
public class Exam4_16 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int s=sc.nextInt();
        for (int i=1;i<23+1;i++){
            System.out.print("* ");
            if(i%s==0){
                System.out.println();
            }
        }


    }
}
