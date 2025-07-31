package Practice_inheritance.Paypay;

public class PayMain {
    public static void main(String[] args) {
        Payment a = new CardPayment("A");
        Payment b = new SimplePayment("B");
        a.pay(5000);


        if (a instanceof Refundable) {
            ((Refundable) a).refund(2000);
        }

        b.pay(3000);

        if (b instanceof Refundable) {
            ((Refundable) b).refund(1500);  // 실행 안됨
        }
    }

}
