package Ch02_control_statement;
import java.util.*;
public class LargeTest {
    public static void main(String[] args) {
        int Com = (int)(Math.random()*10000)+1;
        System.out.println("10000이하의 정수를 입력하십시오");
        Scanner scan = new Scanner(System.in);

        while (true){
            int sc=scan.nextInt();
            if(Com>sc){
            System.out.println("Your Num is too small");}

            else if(Com<sc) {
            System.out.println("Your Num is too Large");
            }
            else {
                System.out.println("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCOOOOOOOOOOOOOOOOOOOOOOOOO\nOOOOOOOOOOOOOOOOOOOOOOORRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRREEEEEEEEEEEEEEEEEEEEEEEEEEEEEE\nEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE\nEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEECCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCTTTTTTTTTTTTTTTTTTTT\nTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
                break;
            }
            }

        scan.close();
    }
}
