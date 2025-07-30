package Practice_method;
import java.util.*;
public class ADDmethod {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("press any num");
        long nu = sc.nextLong();
        long ma=factorial(nu);
        System.out.println(ma);


    }
    public static  long factorial(long n){
        long j=1;
        for(long i=n;i>1;i--){
            j*=i;
        }
        return j;
    }

}

