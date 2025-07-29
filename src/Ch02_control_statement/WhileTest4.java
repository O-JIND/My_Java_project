package Ch02_control_statement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileTest4 {
    public static void main(String[] args) {
        int a,i=0,j=0,k=0;
        Scanner sc =new Scanner(System.in);
        while(true){
            try {
                System.out.print("점수 입력 : ");
                a=sc.nextInt();
                if(a>0){
                    j+=a;
                    i++;
                } else if (-11>a) {
                    System.out.println("조건에 만족하지 않아 종료합니다.");
                    break;
                } else{
                        j+=Math.abs(a);
                        i++;
                }
                }catch (InputMismatchException e){
                System.out.println("숫자를 입력하세요");
                sc.nextLine();
                continue;
                }
        }
        k=j/i;
        System.out.println("총 시험 횟수 : " + i);
        System.out.println("총점 : " + j);
        System.out.println("평균 "+k);
    }
}
