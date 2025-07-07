package twoSum.bruteForce;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            for (int j = 1; j < nums.length; j++){
                if (target - nums[i] == nums[j]) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{};
    }
}
