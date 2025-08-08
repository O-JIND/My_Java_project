package Ch07_collection;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> cofeeList = new ArrayList<>();
        cofeeList.add("Americano");
        cofeeList.add("cafeLatte");
        cofeeList.add("Milk tea");
        cofeeList.add("Lemonade");
        cofeeList.add("StrawberryLatte");
        cofeeList.add("Melon Soda");

        System.out.println("size : "+cofeeList.size() );
        int idx = 1,kasd=1;
        String fdata = "Choco Latte";
        idx = cofeeList.indexOf(fdata);
        System.out.println(fdata+ " is " + idx +"index");
        kasd = cofeeList.lastIndexOf(fdata);
        System.out.println(fdata+ " is " + kasd +"index");
        if(idx==-1){
            cofeeList.set(2,fdata);
        }
        for(String s : cofeeList){
            System.out.printf("%s , ",s);
        }

        for ( int i  = 0 ; i<cofeeList.size();i++){
            String data1 = cofeeList.get(1);
            System.out.println(data1);

        }

        cofeeList.remove(5);

    }
}
