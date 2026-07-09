// Last updated: 7/9/2026, 3:05:48 PM
class Solution {
    public int firstUniqueFreq(int[] nums) {
        
        HashMap<Integer, Integer> a = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            a.put(nums[i], a.getOrDefault(nums[i], 0) + 1);
        }
        
        HashMap<Integer, Integer> b = new HashMap<>();
        
        for (int c : a.values()) {
            b.put(c, b.getOrDefault(c, 0) + 1);
        }
        
        for (int i = 0; i < nums.length; i++) {
            int d = a.get(nums[i]);
            if (b.get(d) == 1) {
                return nums[i];
            }
        }
        
        return -1;
    }
}
