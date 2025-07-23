package Ch01_variable_operator;
import java.util.*;
public class While_Practice {
    public static void main(String[] args) {
        int Com = (int)(Math.random()*100)+1;
        Scanner scan = new Scanner(System.in);




        while (true){
            int sc=scan.nextInt();
            if(Com>sc){
            System.out.println("Too small");}

            else if(Com<sc) {
            System.out.println("Too Large");
            }
            else {
                System.out.println("Cool");
                break;
            }
            }

        scan.close();
    }
}
