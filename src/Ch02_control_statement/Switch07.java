package Ch02_control_statement;
import java.util.*;
public class Switch07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
            case 3:
            case 5:
                System.out.println("홀수");
                break;
            case 2:
            case 4:
            case 6:
                System.out.println("짝수");
                break;
            default:
                System.out.println("다시");
        }
        System.out.println("줄이는 방식");
        switch (a){
            case 1: case 3: case 5:
                System.out.println("짝");
                break;
            case 2: case 4: case 6:
                System.out.println("홀");
                break;


        }
    }
}
