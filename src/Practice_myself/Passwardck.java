package Practice_myself;
import java.util.*;
public class Passwardck {
    int i=0;
    boolean boo=false,numzon=false;
    public static class WeakPasswordException extends Exception{
        public WeakPasswordException(String msg){
            super(msg);
        }
    }

    public  void length_ch(String k)throws WeakPasswordException{
        int K = k.length();
        if(K>7){
            for(i=0;i<K;i++){
                char ch = k.charAt(i);
                if(Character.isLetter(ch)){
                     boo = true;
                } else {
                    if(Character.isDigit(ch)) {
                        numzon = true;
                    }
                }

            }if(!(boo && numzon)) {
                throw new WeakPasswordException("비밀번호 조건이 만족하지 않습니다.");
            }


        }else{
            System.out.println("비밀번호는 8자리 이상이어야 합니다.");
        }

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Passwardck ps= new Passwardck();
    String a = sc.next();

    try {
        ps.length_ch(a);
        if(ps.boo&&ps.numzon){
            System.out.println("강력한 비밀번호입니다.");
        }
    }catch (WeakPasswordException e){
        System.out.println("조건을 만족하지 않았습니다.");
    }
        System.out.println("검사 완료");
    }
}
