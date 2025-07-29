package Ch02_control_statement;
import java.util.*;

public class WhileTest2 {
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
                }
                else{
                    System.out.println("음수 또는 0이어서 종료합니다.");
                    break;
                }
                }catch (InputMismatchException e){
                System.out.println("양의 정수를 입력하세요");
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
