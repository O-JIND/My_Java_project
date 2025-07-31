package Practice_excption;
import java.util.*;
public class Div {
    public static class  ArithmeticException extends Exception{
        public ArithmeticException(String msg){
            super(msg);
        }
    }

    public static void main(String[] args)throws ArithmeticException {
        Scanner sc = new Scanner(System.in);
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(b==0){
               throw new ArithmeticException("0으로 나눌 수 없음");
            }
            System.out.println("결과값 : " + a/b);

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("종료");
        }
    }

}
