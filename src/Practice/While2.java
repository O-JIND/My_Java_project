package Practice;
import java.util.*;
public class While2 {
    public static void main(String[] args) {

        int Sc,i,j;
        System.out.println("1~10의자리까지의 수");
        Scanner sc = new Scanner(System.in);
        Sc =sc.nextInt();
        i=1;
        j=1;
        while(i<1000){
            if(i%Sc==0){
                j+=i;
                i++;
            }
            else {
                i++;
            }
            }

        System.out.println(j);
    }
}
