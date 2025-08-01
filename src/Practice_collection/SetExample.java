package Practice_collection;

import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> namae = new HashSet<>();
        namae.add("JJ");
        namae.add("KK");
        namae.add("MM");
        namae.add("ME");
        namae.add("RR");
        namae.add("RR");

        System.out.println("이름 목록 : "+ namae);
    }
}
