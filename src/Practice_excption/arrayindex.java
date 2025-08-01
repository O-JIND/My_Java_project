package Practice_excption;
import java.util.*;

public class arrayindex {

    public static void main(String[] args) {
        int[] Aa = {10,20,30};
        Scanner sc =new Scanner(System.in);
        try{
            System.out.print("확인 할 인덱스 : ");
            int idx = sc.nextInt();
            System.out.println(Aa[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("유효하지 않은 인덱스입니다.");
        }
    }
}
