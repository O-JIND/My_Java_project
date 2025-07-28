package Practice_myself;
import java.util.*;
public class KINKO {

    static class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String msg) {
            super(msg);
        }
        }

    public static void main(String[] args) {
        int total = 10000;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("출금 금액을 입력하시오.");
            int a = sc.nextInt();
            if(a>total){
                throw new InsufficientBalanceException("잔액이 부족합니다.");
            }
            int rem = total - a;
            System.out.println("출금 완료\n잔액 : " + rem);
        } catch (InputMismatchException e) {
            System.out.println("숫자를 입력해 주세요");
        }catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }        finally{
            System.out.println("거래 종료");
        }
    }
}