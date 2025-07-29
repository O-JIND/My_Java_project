package Ch02_control_statement;
import java.util.*;
public class WhileTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),i=1,b=0;
        while(i<10){
            b=a*i;
            System.out.println(b);
            i++;
        }

    }
}
