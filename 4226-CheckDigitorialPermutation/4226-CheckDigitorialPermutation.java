// Last updated: 7/9/2026, 3:05:44 PM
class Solution {
    public boolean isDigitorialPermutation(int n) {
      int[] f = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
        int sum = 0;
        int temp = n;

        while (temp > 0) {
            sum += f[temp % 10];
            temp /= 10;
        }

        return isPermutation(n, sum);
    }

    private boolean isPermutation(int a, int b) {
        int[] count = new int[10];

        while (a > 0) {
            count[a % 10]++;
            a /= 10;
        }

        while (b > 0) {
            count[b % 10]--;
            b /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (count[i] != 0) return false;
        }

        return true;
    }
}
