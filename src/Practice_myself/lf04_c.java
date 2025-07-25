package Practice_myself;
import java.util.*;
public class lf04_c {
    String ev,ev1;
    double score;

    public lf04_c(double score){
        this.score = score;
    }

    public void eval(){

        if (score >= 90) {
            ev = "A";
        } else if (score >= 80) {
            ev = "B";
        } else if (score >= 70) {
            ev = "C";
        } else if (score >= 60) {
            ev = "D";
        } else {
            ev = "F";
        }
    }

    public void spec(){
        if (((score % 10)>=7)) {
            ev1 = "+";
        } else if (((score % 10) < 3)) {
            ev1 = "-";
        } else {
            ev1 = "0";
        }
    }
    public void Print(){
        System.out.println("성적 : " + ev + ev1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 : ");
        double score = sc.nextDouble();
        lf04_c LL = new lf04_c(score);
        LL.eval();
        LL.spec();
        LL.Print();


    }
}
