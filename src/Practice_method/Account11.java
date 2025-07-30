package Practice_method;
import java.util.*;

public class Account11 {
    String name;
    int balance;
    public Account11(String name,int balance){
        this.name = name ;
        this.balance = balance;
    }
@Override
public String toString(){
        return String.format("%s  %,d",name,balance);
    }


    public static void main(String[] args) {
        List<Account11> scc = AList.Acounta();
        for (Account11 s : scc){
            if(s.balance>2_000_000){
                System.out.println(s);
            }
        }
    }
}
class AList{
    public static List <Account11> Acounta(){
        List <Account11> aA = new ArrayList<>();
        aA.add(new Account11("A",randmm()));
        aA.add(new Account11("B",randmm()));
        aA.add(new Account11("C",randmm()));
        aA.add(new Account11("D",randmm()));
        aA.add(new Account11("E",randmm()));
        aA.add(new Account11("F",randmm()));
        aA.add(new Account11("G",randmm()));
        aA.add(new Account11("H",randmm()));
        aA.add(new Account11("I",randmm()));
        aA.add(new Account11("J",randmm()));
        aA.add(new Account11("K",randmm()));
        aA.add(new Account11("L",randmm()));
        aA.add(new Account11("M",randmm()));
        aA.add(new Account11("N",randmm()));
        aA.add(new Account11("O",randmm()));
        aA.add(new Account11("P",randmm()));
        aA.add(new Account11("Q",randmm()));
        aA.add(new Account11("R",randmm()));
        aA.add(new Account11("S",randmm()));
        aA.add(new Account11("T",randmm()));
        aA.add(new Account11("U",randmm()));
    return  aA;
    }
    public static int randmm(){
        int AA=(int)(Math.random()*100)*100000;
    return AA;}
}
/* 더 깔끔한 정리
* class AList {
    public static List<Account11> Acounta() {
        List<Account11> aA = new ArrayList<>();
        String[] names = {
            "A", "B", "C", "D", "E", "F", "G", "H",
            "I", "J", "K", "L", "M", "N", "O", "P",
            "Q", "R", "S", "T", "U"
        };
        for (String name : names) {
            aA.add(new Account11(name, randmm()));
        }
        return aA;
    }

    public static int randmm() {
        return (int)(Math.random() * 100) * 100_000;  // 0 ~ 9,900,000
    }
* */