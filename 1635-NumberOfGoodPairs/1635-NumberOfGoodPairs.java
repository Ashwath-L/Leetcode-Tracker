// Last updated: 7/9/2026, 3:07:33 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int a=0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    a++;
                }
            }
        }
        return a;
    }
}