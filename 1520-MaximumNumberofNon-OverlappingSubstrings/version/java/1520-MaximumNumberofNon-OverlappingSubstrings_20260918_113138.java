// Last updated: 9/18/2026, 11:31:38 AM
1class Solution {
2    public List<String> maxNumOfSubstrings(String s) {
3        int n = s.length();
4
5        int[] first = new int[26];
6        int[] last = new int[26];
7
8        Arrays.fill(first, n);
9        Arrays.fill(last, -1);
10
11        // Find first and last occurrence of every character
12        for (int i = 0; i < n; i++) {
13            int ch = s.charAt(i) - 'a';
14
15            if (first[ch] == n) {
16                first[ch] = i;
17            }
18
19            last[ch] = i;
20        }
21
22        List<int[]> intervals = new ArrayList<>();
23
24        // Build all valid intervals
25        for (int ch = 0; ch < 26; ch++) {
26            if (last[ch] == -1) {
27                continue;
28            }
29
30            int start = first[ch];
31            int end = last[ch];
32
33            boolean valid = true;
34
35            for (int i = start; i <= end; i++) {
36                int current = s.charAt(i) - 'a';
37
38                // Character appeared before our starting point
39                if (first[current] < start) {
40                    valid = false;
41                    break;
42                }
43
44                // Include all occurrences of this character
45                end = Math.max(end, last[current]);
46            }
47
48            if (valid) {
49                intervals.add(new int[]{start, end});
50            }
51        }
52
53        // Sort by ending position
54        intervals.sort((a, b) -> {
55            if (a[1] != b[1]) {
56                return Integer.compare(a[1], b[1]);
57            }
58
59            return Integer.compare(a[1] - a[0], b[1] - b[0]);
60        });
61
62        List<String> answer = new ArrayList<>();
63
64        int previousEnd = -1;
65
66        // Greedily select non-overlapping intervals
67        for (int[] interval : intervals) {
68            int start = interval[0];
69            int end = interval[1];
70
71            if (start > previousEnd) {
72                answer.add(s.substring(start, end + 1));
73                previousEnd = end;
74            }
75        }
76
77        return answer;
78    }
79}
80