// Last updated: 7/9/2026, 3:06:14 PM
class Solution {
    public int[] sortByReflection(int[] nums) {

        Integer[] a = new Integer[nums.length];
        for (int b = 0; b < nums.length; b++) {
            a[b] = nums[b];
        }

        Arrays.sort(a, (b, c) -> {
            int d = 0, e = 0;
            int f = b, g = c;

            while (f > 0) {
                d = d * 2 + (f % 2);
                f = f / 2;
            }

            while (g > 0) {
                e = e * 2 + (g % 2);
                g = g / 2;
            }

            if (d != e) return d - e;
            return b - c;
        });

        for (int b = 0; b < nums.length; b++) {
            nums[b] = a[b];
        }

        return nums;
    }
}