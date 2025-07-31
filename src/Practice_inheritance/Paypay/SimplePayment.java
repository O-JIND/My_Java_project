package Practice_inheritance.Paypay;

public class SimplePayment extends Payment{
    public SimplePayment(String user){
        super(user);
    }
    @Override
    public void pay(double amount){
        System.out.printf("%s 님이 간편결제로 %,.2f원 결제했습니다.\n",user,amount);
    }



}







