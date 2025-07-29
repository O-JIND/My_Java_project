package Problem_Practice;
import java.util.*;
import java.util.Scanner;
public class Bank_Sys {
    private int balance = 10000;
    public static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String msg){
            super(msg);
        }
    }
    public void Choose(int a) throws InsufficientFundsException{
        Scanner sc = new Scanner(System.in);
        int b;
        switch (a) {
            case 1:
              System.out.println("입금할 금액을 입력하세요");
              b=sc.nextInt();
              balance += b;
                System.out.println("Total : "+balance);
                break;
            case 2:
              System.out.println("출금할 금액을 입력하세요");
              b=sc.nextInt();
              if(b>balance) {
                  throw new InsufficientFundsException(("잔액이 부족합니다."));
              }
              balance-=b;
              System.out.println("Total : "+balance);

              break;

            default:
                throw new InsufficientFundsException("다시 선택해주세요.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank_Sys bk = new Bank_Sys();

        while(true) {
            try {
                System.out.println("1 - Deposit 2 - Withdraw");
                int a = sc.nextInt();
                bk.Choose(a);
                System.out.println("Exit? - press 0");
                int End = sc.nextInt();
                if(End==0){
                    System.out.println("사용을 종료합니다.");
                    System.exit(0);
                }


            } catch (InputMismatchException e) {
                System.out.println("다시 입력해주세요.");
                sc.nextLine();
                continue;

            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
                continue;
            }
        }



    }

}
