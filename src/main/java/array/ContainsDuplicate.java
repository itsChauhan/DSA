package array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate{


    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,4,1}));
    }

    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> numSet = new HashSet<>();
        for(int i = 0;i < n ;i++){
            if(numSet.contains(nums[i])){
                return true;
            }else{
                numSet.add(nums[i]);
            }
        }
        return false;
    }
}
