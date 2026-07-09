// Last updated: 7/9/2026, 3:06:55 PM
class Solution {
    public int minimumOperations(int[] nums) {
     int a = 0;
        for (int i : nums) {
            int b = i % 3;
            if (b == 1 || b == 2) {
                a++;
            }
        }
        return a;   
    }
}