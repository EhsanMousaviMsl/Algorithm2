package containsDuplicate.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static boolean containsDuplicate (int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])){
                return true;
            }

            set.add(arr[i]);
            
        }
        return false;
     }

     public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);
     }
}


