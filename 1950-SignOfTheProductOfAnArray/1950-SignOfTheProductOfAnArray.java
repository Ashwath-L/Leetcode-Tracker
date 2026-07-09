// Last updated: 7/9/2026, 3:07:26 PM
class Solution {
    public int arraySign(int[] nums) {
        int n = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                n+=1;
            }
            if(nums[i]==0){
                return 0;
            }
        }
        if(n%2==0){
            return 1;
        }else{
            return -1;
        }
        
    }
}