package Ch07_collection;

import java.util.HashSet;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<Object>();
        set.add("sdd");
        set.add("s2d");
        set.add("s1d");
        set.add("s3d");
        set.clear();



        set.add("아메리카노");
        set.add("카푸치노");
        set.add("밀크쉐이크");
        set.add("딸기라떼");




        String data = "망고라떼";
        System.out.println( data +" : " + set.contains(data)  );
        System.out.println("크기 : " + set.size());
        if(!set.remove(data)) {
            set.add(data);
        }
        for(Object s : set) {
            System.out.print(s + " ");
        }







    }




}
