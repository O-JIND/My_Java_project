package Practice_collection;
import java.util.*;

public class GennTest {
    public static void main(String[] args) {
        Genn<String> strGen = new Genn<>();
        strGen.setItem("My Man");
        System.out.println("String : " +strGen.getItem());

        Genn<Integer> intGen = new Genn<>();
        intGen.setItem(123);
        System.out.println("int " +intGen.getItem());

    }
}
