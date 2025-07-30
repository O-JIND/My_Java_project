package Practice_method;
import java.util.*;
public class Account01 {
    public static void main(String[] args) {

    List<Acc> Acnt = Myaccount.getAccount_List();
    for(Acc a : Acnt){
        System.out.println(a);
    }
    }
}

class Acc {
    String name;
    int mon;


    public Acc(String name, int mon){
        this.name = name;
        this.mon = mon;
    }
    @Override
    public String toString() {
        return String.format("%s 님의 계좌 잔액: %,d원", name, mon);
    }
}

class Myaccount {
    public static List<Acc> getAccount_List() {
        List<Acc> Acnt = new ArrayList<>();
        Acnt.add(new Acc("김진성", 30000));
        Acnt.add(new Acc("박지용", 500000));
        Acnt.add(new Acc("조현빈", 2000000));
        Acnt.add(new Acc("김다희", 4000000));
        Acnt.add(new Acc("김미희", 700000000));
        Acnt.add(new Acc("김덕배", 900000000));
        return Acnt;
    }
}