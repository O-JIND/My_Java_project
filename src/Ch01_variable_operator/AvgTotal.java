package Ch01_variable_operator;

public class AvgTotal {

    public static void main(String[] args) {

        double[] arr = {12.3, 45.6, 78.9};

        double total=0, average ;

        for(int i=0;i<arr.length;i++) {
            total += arr[i];
        }

        average= total/arr.length;
        System.out.println(total);
        System.out.println(average);

    }
}
