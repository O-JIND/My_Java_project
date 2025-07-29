package Practice_myself;
import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(15);

        System.out.println("저장된 값들 :");
        for(int a :numbers){
            System.out.println(a);
        }

    }
}
