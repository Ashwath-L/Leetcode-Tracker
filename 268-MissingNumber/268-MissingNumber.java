// Last updated: 7/9/2026, 3:08:53 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int t = 0;
        for(int i =0;i<=n;i++){
            t=i+t;
        } 
        for(int j = 0;j<n;j++){
            t=t-nums[j];
        }
        return t;
    }
    
}