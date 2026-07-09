// Last updated: 7/9/2026, 3:09:21 PM
class Solution {
    public int hammingWeight(int n) {
       int a = 0;
        while (n != 0) {
            a += n & 1;
            n >>= 1;
        }
        return a;
    } 
}