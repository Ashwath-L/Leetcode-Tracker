// Last updated: 7/9/2026, 3:10:53 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int a = 0;
        int b = nums.length - 1;
        while (a <= b) {
            int c = (a + b) / 2;
            if (nums[c] == target) {
                return c;
            }
            else if (nums[c] < target) {
                a = c + 1;
            }
            else {
                b = c - 1;
            }
        }
        return a;
    }
}