package Practice_excption;
import java.util.*;
public class Age_Det {
    public static class IllegalArgumentException extends Exception{
        public  IllegalArgumentException(String msg){
            super(msg);
        }
    }
    public static void main(String[] args) throws IllegalArgumentException{
        Scanner sc = new Scanner(System.in);

        while(true){
            try {
                int a = sc.nextInt();
                if (a > 130 || a < 0) {
                    throw new IllegalArgumentException("유효한 나이를 입력하시오.");
                }
                System.out.printf("당신의 나이는 %d살 입니다. \n", a);
                break;

            } catch (IllegalArgumentException e) {
                System.out.println("다시");
                sc.nextLine();
                continue;
            } catch (InputMismatchException e) {
                System.out.println("다시");
                sc.nextLine();
                continue;
            } finally {
                System.out.println("프로그램 종료");
            }
        }

    }
}
