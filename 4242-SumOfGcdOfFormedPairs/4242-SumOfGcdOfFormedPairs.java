// Last updated: 7/9/2026, 3:05:37 PM
import java.util.*;

class Solution {
    public long gcdSum(int[] nums) {

        int n = nums.length;
        int[] arr = new int[n];
        int m = nums[0];

        for (int i = 0; i < n; i++) {
            if (nums[i] > m)
                m = nums[i];

            arr[i] = gcd(nums[i], m);
        }

        Arrays.sort(arr);

        long sum = 0;

        for (int i = 0; i < n / 2; i++) {
            sum += gcd(arr[i], arr[n - 1 - i]);
        }

        return sum;
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}