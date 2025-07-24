package Practice;
import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        int x,y;
        System.out.println("Press any two nums");
        Scanner sc = new Scanner(System.in);

        x= sc.nextInt();
        y= sc.nextInt();
        int[][] rnd = new int[x][y];

        for (int i = 0; i < x; i++) {
            for(int j =0 ; j < y ;j++){
            rnd[i][j] = (int) (Math.random() * 100);
            System.out.print(rnd[i][j] + " ");
        }
            System.out.println();

        }


    }

}


