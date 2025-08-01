package Problem_Practice;

import java.util.HashMap;

public class BasicHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer>score = new HashMap<>();
        score.put("Alice",87);
        score.put("Bob",81);
        score.put("Charlie",78);

        System.out.println("Bob's score : " + score.get("Bob"));
        for(String s: score.keySet()){
            System.out.println(s +" : "+ score.get(s));
        }

    }
}
