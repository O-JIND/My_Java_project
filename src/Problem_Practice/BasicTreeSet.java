package Problem_Practice;

import java.util.TreeSet;

public class BasicTreeSet {
    public static void main(String[] args) {
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
