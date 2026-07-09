// Last updated: 7/9/2026, 3:07:13 PM
class Solution {
    public int averageValue(int[] nums) {
     int n= 0;
     int c =0;
     for(int i =0;i<nums.length;i++){
        if(nums[i]%2==0 & nums[i]%3==0){
            n+=nums[i];
            c+=1;
        }
     }if(c<=1){
        return n;
     }else{
        return n/c;
     }
    }
}