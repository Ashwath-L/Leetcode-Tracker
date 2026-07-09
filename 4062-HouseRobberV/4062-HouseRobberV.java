// Last updated: 7/9/2026, 3:06:26 PM
class Solution {
    public long rob(int[] nums, int[] colors) {
        
        long a = 0;
        long b = 0;
        
        for (int i = 0; i < nums.length; i++) {
            
            long c;
            
            if (i > 0 && colors[i] == colors[i - 1]) {
                c = b + nums[i];
            } else {
                c = Math.max(a, b) + nums[i];
            }
            
            long d = Math.max(a, b);
            
            a = c;
            b = d;
        }
        
        return Math.max(a, b);
    }
}