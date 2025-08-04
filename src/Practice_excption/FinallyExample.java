package Practice_excption;
import java.util.Scanner;
public class FinallyExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("숫자 입력 :");
            int num = sc.nextInt();
            System.out.println("입력한 숫자 :"+num);

        }catch (Exception e){
            System.out.println("입력이 올바르지 않습니다.");

        } finally{
            System.out.println("프로그램을 종료합니다.");
            sc.close();
        }
    }
}
