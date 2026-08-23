// Last updated: 8/23/2026, 7:03:59 PM
1class Solution {
2    public boolean sumGame(String num) {
3        int n = num.length();
4        int diff = 0;
5        int count = 0;
6
7        for (int i = 0; i < n; i++) {
8            boolean firstHalf = i < n / 2;
9
10            if (num.charAt(i) == '?') {
11                count += firstHalf ? 1 : -1;
12            } else {
13                int digit = num.charAt(i) - '0';
14                diff += firstHalf ? digit : -digit;
15            }
16        }
17
18        return 2 * diff != -9 * count;
19    }
20}