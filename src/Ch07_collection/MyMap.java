package Ch07_collection;

import java.util.*;

public class MyMap {
    public static void main(String[] args) {
        Map<String, Integer> teamMap = new HashMap<>();
        teamMap.put("LG",1);
        teamMap.put("한화",2);
        teamMap.put("롯데",3);
        teamMap.put("KIA",4);
        teamMap.put("SSG",5);
        teamMap.put("KT",6);
        teamMap.put("삼성",7);
        teamMap.put("NC",8);
        teamMap.put("두산",9);
        teamMap.put("키움",10);

        String find = "Ob";
        Boolean bool = teamMap.containsKey(find);
        System.out.println("Is the NC Existed?" + bool);
        if(!bool){
            teamMap.put(find,5);
        }
        System.out.println();
        System.out.println(teamMap.containsValue(5));
        System.out.println();

        for(String m : teamMap.keySet()){
            System.out.println(m);
        }

        String[] teams = { "롯데","한화","키움","삼성"};
        find ="La";
        Integer rank  = teamMap.get(find);
        if (rank==null){
            System.out.println("팀이 존재 X");
        }else{
            String msg = "팀 명 : " + find + "  순위"  + rank;
            System.out.println(msg);

        }
        if (teamMap.isEmpty()){
            System.out.println("Beam");

        }else {
            System.out.println("ahn Beam");
        }


    }


}
