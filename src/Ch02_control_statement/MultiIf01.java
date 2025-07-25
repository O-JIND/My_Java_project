package Ch02_control_statement;
import java.util.*;
public class MultiIf01 {
    public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    double Tem;
        System.out.print("지금 날씨?:  ");
    Tem = sc.nextDouble();
    if (Tem >=37.0){
        System.out.println("살인사건");
    }else if (Tem >=32.0) {
        System.out.println("찜질방");
    }else if (Tem >=23.0) {
        System.out.println("무더운 날씨");
    }else if (Tem >=17.0) {
        System.out.println("쾌적한 날씨");
    }else if (Tem >=7.0) {
        System.out.println("쌀쌀한 날씨");
    }else {
        System.out.println("한기 지옥");
    }


    }
}
