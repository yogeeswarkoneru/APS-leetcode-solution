class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int total, leftsum, i, ls, rs; 
        int [] ans = new int [nums.length]; 
        leftsum = 0; 
        total = 0; 
        for (int x : nums) {
            total = total + x;
        }

        for (i = 0; i < nums.length; i++) {
            ls = i * nums[i] - leftsum; 
            rs = (total - leftsum - nums[i]) - (nums.length - i - 1) * nums[i]; 
            
            leftsum = leftsum + nums[i]; 
            ans[i] = ls + rs; 
        } 
        
        return ans; 
    } 
}