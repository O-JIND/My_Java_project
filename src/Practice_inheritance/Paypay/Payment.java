package Practice_inheritance.Paypay;

public abstract class Payment {
    protected String user;
    protected double amount;


    public Payment(String user){
        this.user=user;
    }
    public abstract void pay(double amount);
}