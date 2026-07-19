// Last updated: 7/19/2026, 7:30:28 PM
1class Solution {
2    public String smallestSubsequence(String s) {
3        int[] l = new int[26];
4        boolean[] v = new boolean[26];
5        for (int i = 0; i < s.length(); i++)
6            l[s.charAt(i) - 'a'] = i;
7        StringBuilder st = new StringBuilder();
8        for (int i = 0; i < s.length(); i++) {
9            char c = s.charAt(i);
10            if (v[c - 'a']) continue;
11            while (st.length() > 0 &&
12                   st.charAt(st.length() - 1) > c &&
13                   l[st.charAt(st.length() - 1) - 'a'] > i) {
14                v[st.charAt(st.length() - 1) - 'a'] = false;
15                st.deleteCharAt(st.length() - 1);
16            }
17            st.append(c);
18            v[c - 'a'] = true;
19        }
20        return st.toString();
21    }
22}