package Practice_myself;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        List<String > names = new ArrayList<>();
        names.add("진성");
        names.add("동욱");
        names.add("채현");


        System.out.println("첫 번쨰 이름 :" + names.get(0));
        System.out.println("전체 출력 :");
        for (String name : names){
            System.out.println(name);
        }
    }
}
