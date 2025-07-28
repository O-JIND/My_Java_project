package Ch02_control_statement;
import java.util.*;
public class Stringswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mon = sc.next();
        int num =0 ;
        switch (mon){
            case "January":
            case "january":
                num=1;
                break;
            case "February":
            case "february":
                num=2;
                break;
            case "March":
            case "march":
                num=3;
                break;
            case "April":
            case "april":
                num=4;
                break;
            case "May":
            case "may":
                num=5;
                break;
            case "June":
            case "june":
                num=6;
                break;
            case "July":
            case "july":
                num=7;
                break;
            case "August":
            case "august":
                num=8;
                break;
            case "September":
            case "september":
                num=9;
                break;
            case "October":
            case "october":
                num=10;
                break;
            case "November":
            case "november":
                num=11;
                break;
            case "December":
            case "december":
                num=12;
                break;
            default:
                System.out.println("다시");
                System.exit(0);
                break;

        }
        System.out.printf(mon+"은 "+num+"월입니다.");
    }
}
