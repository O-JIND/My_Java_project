package Ch02_control_statement;
import java.util.Scanner;

public class MultiIf02 {
    public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    double Tik,Ag,dis;
        System.out.print("나이? : ");
    Ag = sc.nextDouble();
    Tik = 65000;
    if(Ag<8){
        dis=0.9;
        System.out.println("Discount rate : "+(dis*100)+"%" + " 아기");
    } else if (Ag<14) {
        dis=0.4;
        System.out.println("Discount rate : "+dis*100+"%" + " 어린이");
    } else if (Ag<19) {
        dis=0.3;
        System.out.println("Discount rate : "+dis*100+"%"+" 청소년");
    } else if (Ag>130) {
        dis=-100;
        System.out.println("Discount rate : "+dis*100+"%" + " 산신령");

    } else if (Ag>64) {
        dis=0.7;
        System.out.println("Discount rate : "+dis*100+"%" + " 노인");

    }else {
        dis=0;
        System.out.println("Discount rate : "+dis*100+"%" + " 청년");
    }
        System.out.println("총 할인액 :"+ (int)((dis*Tik))+" 티켓 가격 : "+ (int)(Tik*(1-dis))+"원");
    }
}
