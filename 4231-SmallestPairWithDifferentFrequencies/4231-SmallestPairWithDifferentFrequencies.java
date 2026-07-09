// Last updated: 7/9/2026, 3:05:39 PM
class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        int[] f = new int[101];

        for (int i = 0; i < nums.length; i++) {
            f[nums[i]]++;
        }

        for (int x = 1; x <= 100; x++) {
            if (f[x] == 0) continue;

            for (int y = x + 1; y <= 100; y++) {
                if (f[y] == 0) continue;

                if (f[x] != f[y]) {
                    return new int[]{x, y};
                }
            }
        }

        return new int[]{-1, -1};
    }
}