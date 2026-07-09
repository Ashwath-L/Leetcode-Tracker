// Last updated: 7/9/2026, 3:07:12 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int a = 0;
        int b = 0;
        for(int i=0;i<nums.length;i++){
            a+=nums[i];
            while(nums[i]!=0){
                b+=nums[i]%10;
                nums[i]=nums[i]/10;
            }
        }
        return a-b;
    }
}