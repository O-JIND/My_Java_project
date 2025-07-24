package Ch01_variable_operator;

public class ArrTotal {
    public static void main(String[] args) {
        double sum = 0;
        for (double i = 1; i < 51; i++) {

            double a, b;
            a =  (-1)*(1 / (2 * i));
            b = (1 / (2 * i - 1));
            System.out.print(a + " ");
            System.out.println(b);

            sum += a + b;


        }System.out.println(sum);
    }
}
