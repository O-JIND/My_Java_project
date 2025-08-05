package Practice_Thread;

public class BankAccount {
    private  int bal = 1000000;

    public synchronized void withdraw(String user, int amount){
        if(bal >=amount){
            System.out.println("withdrawing");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){ }
            bal -=amount;
            System.out.println( "withdraw completed");
        }else{
            System.out.println("Fail to withdraw");
        }





    }







}
