package Ch02_control_statement;
import java.util.*;
public class Logical01 {
    public static void main(String[] args) {
        System.out.print("1~12 사이로 입력: ");
        Scanner sc = new Scanner(System.in);
        int Mon = sc.nextInt();
        if (Mon<=2 || Mon==12||Mon==11){
            System.out.println("冬");
        } else if (Mon >2 && Mon <=4) {
            System.out.println("春");
        } else if (Mon >=5 && Mon <=8 ) {
            System.out.println("夏");
        } else if(Mon==10||Mon==9) {
            System.out.println("秋");
        }else{
            System.out.println("\"다시\"");
        }


    }
}
