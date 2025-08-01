package Practice_collection;
import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Corn");

        System.out.println("과일 목록 : ");
        for(String f : fruits){
            System.out.println(f);
        }


        fruits.remove(0);
        System.out.println(fruits);
    }
}
