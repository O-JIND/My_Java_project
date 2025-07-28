package Ch02_control_statement;
import java.util.*;
public class DaysInMonth {
    public static void main(String[] args) {
        System.out.println("1~12 Integer");
        Scanner sc = new Scanner(System.in);
        int month=sc.nextInt(),last_=0;
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                last_ = 31;
                break;
            case 4: case 6: case 9: case 11:
                last_ = 30;
                break;
            case 2:
                last_ = 28;
                break;

            default:
                System.out.println("다시 입력");
                System.exit(0);
                break;
        }
        System.out.println(month+"월의 마지막 날은 "+ last_ +"일입니다.");


    }
}
