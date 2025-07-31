package Practice_inheritance.Paypay;
public class CardPayment extends Payment implements Refundable{
    public CardPayment(String user){
        super(user);
    }

    @Override
    public void pay(double amount){
        System.out.printf("%s님이  %,.2f원을 결제했습니다.\n",user,amount);

    }
    @Override
    public void refund(double amount){
        System.out.printf("%s님이  %,.2f원을 환불신청했습니다.\n",user,amount);
    }


}
