package containsDuplicate.naiveSolution;

public class Solution {
    public static boolean containsDuplicate (int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return true;
            }
        }
        return false;
     }

     public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);
     }
}
