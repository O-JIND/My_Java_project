package Practice_collection;
import java.util.HashMap;
public class MapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> scoreMap = new HashMap<>();

        scoreMap.put("A",90);
        scoreMap.put("B",85);
        scoreMap.put("C",94);


        System.out.println("B의 점수 "+ scoreMap.get("B"));
        for(String k : scoreMap.keySet()){
            System.out.println(k + " : "+ scoreMap.get(k));
        }
    }
}
