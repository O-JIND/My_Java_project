package Practice_myself;
import java.util.*;
public class Ran {
        int i;
    public static class OutOfRangeException extends Exception{
        public OutOfRangeException(String msg){
            super(msg);
        }
        }
    public static void main(String[] args) throws OutOfRangeException  {
        int a,p;
        a = (int)( Math.random()*100);
        Scanner sc = new Scanner(System.in);
        try {
            for(int i=0;i<10;i++){
                System.out.print("any number 1~100: ");
                p=sc.nextInt();
                int j=9-i;
                if(a==p){
                    System.out.println("정답입니다!");
                    break;
                } else if (p>100) {
                    throw new OutOfRangeException("범위에서 벗어났습니다. " +j+"/10");
                }else if (a>p) {
                    System.out.println("Up "+j+"/10");
                } else if (a<p) {
                    System.out.println("Down " +j+"/10");
                }  else{
                    System.out.println("다시 입력하세요." +j+"/10");
                }

            }
        }catch(OutOfRangeException  e){
            System.out.println(e.getMessage());

        }

    }







}
