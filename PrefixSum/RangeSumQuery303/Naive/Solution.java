package PrefixSum.RangeSumQuery303.Naive;

public class Solution {
    private int[] nums;  

    public Solution(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int start, int end) { 
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        Solution solution = new Solution(arr);  
        int ans = solution.sumRange(1, 3);      
        System.out.println(ans);  
    }
}