package Practice_myself;

public class BankMain {
    public static void main(String[] args) {

        Bank bk1 = new Bank ("강남");
        Bank.interest = 0.2f;
        bk1.getInfo();

        System.out.println("====================================================");

        Bank bk2 = new Bank("대전");
        Bank.interest=0.33f;
        bk2.getInfo();

    }
}
