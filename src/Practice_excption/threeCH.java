package Practice_excption;
import java.util.*;
public class threeCH {
    public static  class ShortStringException extends  Exception{
        public ShortStringException(String msg){
            super(msg);
        }
    }
    public static void main(String[] args) throws ShortStringException {
        Scanner sc = new Scanner(System.in);


        try{
            String a = sc.next();
            if(a.length()<3){
                throw new ShortStringException("문자열은 3자이상이어야 합니다.");
            }
            System.out.println("입력된 문자열 :"+ a);
        } catch (ShortStringException e) {
            System.out.println(e.getMessage());
        }
    }

}
