package Ch02_control_statement;
import java.util.*;
public class ForTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("any num");
        int num = sc.nextInt(),j;
        for (int i=1; i <10;i++){
            j=i*num;
            System.out.println (num+"*"+ i+"= "+j);
        }


    }
}
