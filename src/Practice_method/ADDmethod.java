package Practice_method;
import java.util.*;
public class ADDmethod {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("press any num");
    }
    public static int factorial(int n){
        int j=1;
        for(int i=n+1;i>1;i--){
            j*=i;

        }
        System.out.println(j);
    }

}

