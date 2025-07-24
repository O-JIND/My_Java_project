package Ch01_variable_operator;

public class Increment01 {
    public static void main(String[] args) {
        int i, total=0;

        for(i=1;i<11;i++){
            total+=i;
            System.out.println(total);

        }
        System.out.println("출력결과는 "+total);

    }
}
