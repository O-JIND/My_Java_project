package Ch02_control_statement;

public class For02 {
    public static void main(String[] args) {
        int i, j=0, k=0;
        for (i = 1; i < 11; i++){
            if (i % 2 == 0) {

                j += i;
                System.out.println(j);
            }

            else{
                k += i;
                System.out.println(k);
            }
        }
        System.out.println("짝수의 합 : "+ j);
        System.out.println("홀수의 합 "+k);
    }
}


