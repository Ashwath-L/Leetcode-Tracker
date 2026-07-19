// Last updated: 7/19/2026, 9:04:48 AM
1class Solution {
2    public boolean[] transformStr(String s, String[] strs) {
3
4        int a = s.length();
5        int b = strs.length;
6
7        boolean[] c = new boolean[b];
8
9        int[] d = new int[a];
10        int e = 0;
11
12        for (int f = 0; f < a; f++) {
13            if (s.charAt(f) == '1') e++;
14            d[f] = e;
15        }
16
17        for (int f = 0; f < b; f++) {
18
19            String g = strs[f];
20
21            int h = 0;
22            int i = 0;
23
24            for (int j = 0; j < a; j++) {
25                if (g.charAt(j) == '1') h++;
26                else if (g.charAt(j) == '?') i++;
27            }
28
29            int k = e - h;
30
31            if (k < 0 || k > i) {
32                c[f] = false;
33                continue;
34            }
35
36            int l = 0;
37            int m = 0;
38            boolean n = true;
39
40            for (int j = 0; j < a; j++) {
41                if (g.charAt(j) == '1') l++;
42                else if (g.charAt(j) == '?') m++;
43
44                int o = i - m;
45                int p = Math.max(0, k - o);
46
47                if (l + p > d[j]) {
48                    n = false;
49                    break;
50                }
51            }
52
53            c[f] = n;
54        }
55
56        return c;
57    }
58}