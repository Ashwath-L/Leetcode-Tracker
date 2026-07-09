// Last updated: 7/9/2026, 3:10:49 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int t=1;
        for(int i =0;i<n;i++){
            if(nums[i]==t){
                t++;
            }
        }
        return t;
    }
}