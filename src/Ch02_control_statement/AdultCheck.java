package Ch02_control_statement;
import java.util.*;
public class AdultCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("name");
        String name = sc.next();

        System.out.println("sex - male or female");
        String sex=sc.next();

        System.out.println("age");
        int age=sc.nextInt();

        System.out.println("이름 : "+ name);
        System.out.println("나이 : "+ age);
        if(sex.equals("male")){
            System.out.println("성별 : Male");
            sex = "Male";
        }
        else if(sex.equals("female")) {
            System.out.println("성별 : Female");
            sex = "Female";
        }
        else{
            System.out.println("성별을 다시 입력해주세요");
        }
        String ID;
        if(age>19){
            ID = "성인";
        }
        else{
            ID = "미성년자";
        }
        System.out.println("이름: "+ name +" "+ "나이:"+ " "+age +" ("+ ID +")("+sex+")");


    }
}
