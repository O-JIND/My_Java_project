package Practice_excption;
import java.util.Scanner;
public class ThrowExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이 :");
        int age = sc.nextInt();
        try{
            checkAge(age);

        }catch(IllegalArgumentException e){
            System.out.println("오류 발생: " +e.getMessage() );
        }


    }
    public static void checkAge(int age) throws IllegalArgumentException {
        if (age<19){
            throw new IllegalArgumentException("미성년자는 입장하실 수 없습니다.");
        }
    }

}
