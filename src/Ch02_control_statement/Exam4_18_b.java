package Ch02_control_statement;

import java.util.Scanner;

public class Exam4_18_b {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i,j = sc.nextInt(),k=sc.nextInt(),T=0;
        if(k>=j)
            for (i =j; i<k;i++){
                T += i;
                System.out.println(T);
        }
        else{
            for (i =k; i<j;i++){
                T += i;
                System.out.println(T);
            }
        }
    }
}
