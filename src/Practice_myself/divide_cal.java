package Practice_myself;
import java.util.*;
public class divide_cal {
    float a=0f, b=0f;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("first");
            int a= sc.nextInt();
            System.out.println("second");
            int b=sc.nextInt();
            int c = a/b;
            System.out.println("result : "+c);
        }catch(ArithmeticException e){
            System.out.println("0으로는 나눌 수 없습니다!");
        }finally {
            System.out.println("END");
            sc.close();
        }
    }




}


