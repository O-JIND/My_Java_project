package Ch02_control_statement;
import java.util.*;
public class Switch08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a){
            case 3: case 4:
                System.out.printf("%d月之春\n",a);
                break;
            case 5: case 6: case 7: case 8:
                System.out.printf("%d月之夏\n",a);
                break;
            case 9: case 10:
                System.out.printf("%d月之秋\n",a);
                break;
            case 11: case 12: case 1: case 2:
                System.out.printf("%d月之冬\n",a);
                break;
            default:
                System.out.println("다시");
                break;
        }

    }
}
