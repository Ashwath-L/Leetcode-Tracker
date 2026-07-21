// Last updated: 7/21/2026, 9:00:58 AM
1class Solution {
2    public int maxActiveSectionsAfterTrade(String s) {
3        int ones = 0;
4        for (char c : s.toCharArray())
5            if (c == '1')
6                ones++;
7        s = "1" + s + "1";
8        int n = s.length();
9        int i = 0;
10        int ans = ones;
11        while (i < n && s.charAt(i) == '1')
12            i++;
13        int c10 = 0;
14        while (i < n && s.charAt(i) == '0') {
15            c10++;
16            i++;
17        }
18        while (i < n) {
19            int c11 = 0;
20            while (i < n && s.charAt(i) == '1') {
21                c11++;
22                i++;
23            }
24            if (c11 == 0)
25                break;
26            int c20 = 0;
27            while (i < n && s.charAt(i) == '0') {
28                c20++;
29                i++;
30            }
31            if (c20 == 0)
32                break;
33            ans = Math.max(ans, ones + c10 + c20);
34            c10 = c20;
35        }
36        return ans;
37    }
38}