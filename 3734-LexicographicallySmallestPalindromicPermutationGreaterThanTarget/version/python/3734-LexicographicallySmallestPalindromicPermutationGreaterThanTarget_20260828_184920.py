# Last updated: 8/28/2026, 6:49:20 PM
1class Solution:
2    def lexPalindromicPermutation(self, s: str, target: str) -> str:
3        n = len(s)
4        half = n // 2
5        freq = [0] * 26
6        hasC = 0
7        par = 0
8        for ch in s:
9            idx = ord(ch) - 97
10            freq[idx] += 1
11            hasC |= (1 << idx)
12            par ^= (1 << idx)
13
14        if bin(par).count('1') > 1:
15            return ""
16
17        odd_idx = -1
18        if n & 1:
19            odd_idx = (par & -par).bit_length() - 1  # countr_zero
20
21        mask = hasC
22        while mask:
23            i = (mask & -mask).bit_length() - 1
24            freq[i] //= 2
25            if freq[i] == 0:
26                hasC &= ~(1 << i)
27            mask &= mask - 1
28
29        dp = {}
30
31        def rev_left_is_gr_r(t: str) -> bool:
32            for i in range(half):
33                if t[half - 1 - i] > t[half + (n & 1) + i]:
34                    return True
35                if t[half - 1 - i] < t[half + (n & 1) + i]:
36                    return False
37            return False
38
39        def can_place(i: int, hc: int) -> bool:
40            if i in dp:
41                return dp[i]
42            c = ord(target[i]) - 97
43            if freq[c] == 0:
44                dp[i] = False
45                return False
46
47            freq[c] -= 1
48            hc1 = hc
49            if freq[c] == 0:
50                hc1 &= ~(1 << c)
51
52            ans = False
53            if i == half - 1:
54                if n & 1:
55                    mid = ord(target[half]) - 97
56                    if odd_idx != mid:
57                        ans = odd_idx > mid
58                    else:
59                        ans = rev_left_is_gr_r(target)
60                else:
61                    ans = rev_left_is_gr_r(target)
62            else:
63                nxt = ord(target[i + 1]) - 97
64                if hc1 >> (nxt + 1):
65                    ans = True
66                elif not ((hc1 >> nxt) & 1):
67                    ans = False
68                else:
69                    ans = can_place(i + 1, hc1)
70
71            freq[c] += 1
72            dp[i] = ans
73            return ans
74
75        def build_palindrome(built: str) -> str:
76            pal = built
77            if n & 1:
78                pal += chr(97 + odd_idx)
79            pal += built[::-1]
80            return pal
81
82        ans_chars = []
83        for i in range(half):
84            t_i = ord(target[i]) - 97
85            if freq[t_i] > 0 and can_place(i, hasC):
86                ans_chars.append(target[i])
87                freq[t_i] -= 1
88                if freq[t_i] == 0:
89                    hasC &= ~(1 << t_i)
90            else:
91                higher = hasC >> (t_i + 1)
92                if higher == 0:
93                    return ""
94                choice = (higher & -higher).bit_length() - 1 + t_i + 1
95                freq[choice] -= 1
96                if freq[choice] == 0:
97                    hasC &= ~(1 << choice)
98                ans_chars.append(chr(97 + choice))
99
100                for _ in range(i + 1, half):
101                    idx = (hasC & -hasC).bit_length() - 1
102                    ans_chars.append(chr(97 + idx))
103                    freq[idx] -= 1
104                    if freq[idx] == 0:
105                        hasC &= ~(1 << idx)
106                return build_palindrome(''.join(ans_chars))
107
108        pal = build_palindrome(''.join(ans_chars))
109        return pal if pal > target else ""