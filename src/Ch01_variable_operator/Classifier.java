package Ch01_variable_operator;

public class Classifier {
    public static void main(String[] args) {

        int a = (int)(Math.random()*100);

        System.out.println(a);
        if  (a%2==0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

    }
}
