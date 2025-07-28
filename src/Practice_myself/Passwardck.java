package Practice_myself;
import java.util.*;
public class Passwardck {
    int i=0;
    static class WeakPasswordException extends Exception{
        public WeakPasswordException(String msg){
            super(msg);
        }
    }

    public void length_ch(String k){
        int K = k.length();
        if(K>7){
            for(i=0;i<K;i++){
                char ch = k.charAt(i);
                if((ch<90&&ch>65)||(ch>97&&ch<122)){
                    boolean boo = true;
                } else if (ch) {
                    
                }

            }
        }else{
            System.out.println("만족 x");
        }





    }


    public static void main(String[] args) {





    }



}
