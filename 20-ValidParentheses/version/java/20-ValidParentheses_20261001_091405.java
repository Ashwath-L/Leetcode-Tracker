// Last updated: 10/1/2026, 9:14:05 AM
1class Solution {
2
3    public boolean isValid(String s) {
4
5        Stack<Character> st = new Stack<>();
6
7        for (char c : s.toCharArray()) {
8
9            if (c == '(' || c == '{' || c == '[') {
10
11                st.push(c);
12
13            } else {
14
15                if (st.isEmpty()) return false;
16
17                char top = st.pop();
18
19                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
20
21                    return false;
22
23                }
24
25            }
26
27        }
28
29        return st.isEmpty();
30
31    }
32
33}