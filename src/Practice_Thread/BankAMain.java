package Practice_Thread;

public class BankAMain{
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Myth t1 = new Myth(account, "Alice");
        Myth t2 = new Myth(account, "Bob");



        t1.start();
        t2.start();


    }
}



class Myth extends Thread{
private BankAccount account;
private  String user;

public Myth(BankAccount account, String user){
    this.account = account;
    this. user = user;
}


public void run(){
    account.withdraw(user,8000);
}
}