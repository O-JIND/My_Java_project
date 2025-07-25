package Practice_myself;
import java.util.*;
public class AdultCheck_c {
    String name, sex;
    int age;
    String ID,Idn;
    public AdultCheck_c(String name, String sex, int age){
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.ID=(age>19)?"성인" : "미성년자";
    }
    public void print(){
        System.out.println("이름: "+ name +" "+ "나이:"+ " "+age +" ("+ ID +")("+sex+")");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("이름 입력: ");
        String name = sc.next();

        System.out.print("성별 입력 (male/female): ");
        String sex = (sc.next());

        System.out.print("나이 입력: ");
        int age = sc.nextInt();

        AdultCheck_c person = new AdultCheck_c(name,sex,age);
        person.print();
    }
}
