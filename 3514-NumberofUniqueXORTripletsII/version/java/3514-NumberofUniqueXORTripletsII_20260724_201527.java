// Last updated: 7/24/2026, 8:15:27 PM
1import java.util.*;
2class Solution {
3    public int uniqueXorTriplets(int[] nums) {
4        int n = nums.length;
5        if (n == 1) {
6            return 1;
7        }
8        HashSet<Integer> pairXor = new HashSet<>();
9        for (int i = 0; i < n; i++) {
10            for (int j = i + 1; j < n; j++) {
11                pairXor.add(nums[i] ^ nums[j]);
12            }
13        }
14        BitSet seen = new BitSet();
15        for (int x : pairXor) {
16            for (int num : nums) {
17                seen.set(x ^ num);
18            }
19        }
20        return seen.cardinality();
21    }
22}