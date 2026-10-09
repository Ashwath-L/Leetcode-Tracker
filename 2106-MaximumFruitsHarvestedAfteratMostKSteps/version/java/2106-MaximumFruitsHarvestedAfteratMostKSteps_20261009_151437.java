// Last updated: 10/9/2026, 3:14:37 PM
1import java.util.*;
2
3public class Solution {
4    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
5        int n = fruits.length;
6        int left = 0, total = 0, maxFruits = 0;
7
8        for (int right = 0; right < n; right++) {
9            total += fruits[right][1]; 
10
11            while (left <= right) {
12                int leftPos = fruits[left][0];
13                int rightPos = fruits[right][0];
14
15                int dist = Math.min(
16                    Math.abs(startPos - leftPos) + (rightPos - leftPos),
17                    Math.abs(startPos - rightPos) + (rightPos - leftPos)
18                );
19
20                if (dist <= k) break;
21
22                total -= fruits[left][1];  
23                left++;
24            }
25
26            maxFruits = Math.max(maxFruits, total);
27        }
28
29        return maxFruits;
30    }
31}