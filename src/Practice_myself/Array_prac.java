package Practice_myself;

import java.util.*;

public class Array_prac {
    public static void main(String[] args) {
        int i=0;
        Scanner sc = new Scanner(System.in);
        ArrayList <String> arr = new ArrayList<>();
        while(true){
            String input = sc.next();
            if (input.equals("end")){
                break;
            }
            arr.add(input);


        }
        for (i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
