package Ch02_control_statement;
import java.util.*;
public class If04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Score = sc.nextInt();

        if (Score >= 90) {
            System.out.println("A");
        } else if (Score >= 80&&Score < 90) {
            System.out.println("B");
        } else if (Score >= 70&&Score < 80) {
            System.out.println("C");
        } else if (Score >= 60&&Score < 70) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
