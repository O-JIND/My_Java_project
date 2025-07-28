package Practice_myself;

import java.util.Scanner;

public class Switch_class {
    public void VF(int b) {
        switch(b) {
            case 1: case 3: case 5:
                System.out.println("홀수");
                break;
            case 2: case 4: case 6:
                System.out.println("짝수");
                break;
            default:
                System.out.println("다시");
            }
        }
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            Switch_class sd = new Switch_class();
            sd.VF(a);
            }

}


