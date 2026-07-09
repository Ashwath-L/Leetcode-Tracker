// Last updated: 7/9/2026, 3:05:27 PM
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            long sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                long t=sum;
                while(t>=10) t/=10;
                if(t==x && sum%10 == x) ans++;
            }
        }
        return ans;
    }
}