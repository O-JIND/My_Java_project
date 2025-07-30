package Practice_method;
import java.util.*;
public class Account {
    private String owner;
    private int balance;
    Scanner sc = new Scanner(System.in);
    Account(String owner, int balance){
        this.owner = owner;
        this.balance=balance;
    }
    private int deposit(int amount){
        balance += amount;
        return balance;
    }
    private int withdraw(int amount){
        balance -= amount;
        return balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public int Scan(){
        int a= sc.nextInt();
        return a;
    }
    public void varify(){
        System.out.println("1 입금 2 출금" );
        int c=Scan();
        switch (c){
            case 1:
                System.out.println("입금할 금액 : ");
                int b=Scan();
                deposit(b) ;
                break;
            case 2:
                System.out.println("출금할 금액 : ");
                b = sc.nextInt();
                if(b>balance) {
                    System.out.println("잔액이 부족합니다.");
                    break;
                }
                withdraw(b);
                break;
            default:
                System.out.println("다시 입력");
                break;
        }
    }

    public static void main(String[] args) {

        Account ac = new Account("김진성",400000);
        ac.varify();


    }
}
