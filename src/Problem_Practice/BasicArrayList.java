package Problem_Practice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class BasicArrayList {
    public static void main(String[] args) {
            List<String>Food = new ArrayList<>();
            Food.add("김밥");
            Food.add("라면");
            Food.add("떡볶이");
            Food.add("순대");
            Food.remove("라면");
            for (String food:Food){
                System.out.println(food);
            }

        HashMap<String,Integer> score = new HashMap<>();
        score.put("Alice",87);
        score.put("Bob",81);
        score.put("Charlie",78);

        System.out.println("Bob's score : " + score.get("Bob"));
        for(String s: score.keySet()){
            System.out.println(s +" : "+ score.get(s));
        }


        int[] nums ={45, 12, 33 ,8 ,45 ,99};
        TreeSet<Integer> tree = new TreeSet<>();
        for(int i=0; i<nums.length;i++)
        {
            tree.add(nums[i]);
        }
        for(Integer tr :tree){
            System.out.print(tr+" ");
        }
        }



    }

