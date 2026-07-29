# Last updated: 7/29/2026, 10:59:40 AM
1from collections import Counter
2
3class Solution(object):
4    def smallestPalindrome(self, s, k):
5        freq = Counter(s)
6        half = [0] * 26
7        mid = ""
8        for ch, cnt in freq.items():
9            half[ord(ch) - ord("a")] = cnt // 2
10            if cnt % 2:
11                mid = ch
12        def comb_capped(n, r, cap):
13            if r < 0 or r > n:
14                return 0
15            r = min(r, n - r)
16            res = 1
17            for i in range(1, r + 1):
18                res = res * (n - r + i) // i
19                if res > cap:
20                    return cap + 1
21            return res
22        def count_perms(cnts, cap):
23            total = sum(cnts)
24            res = 1
25            rem = total
26            for c in cnts:
27                if c:
28                    ways = comb_capped(rem, c, cap)
29                    res *= ways
30                    if res > cap:
31                        return cap + 1
32                    rem -= c
33            return res
34        if count_perms(half, k) < k:
35            return ""
36        first = []
37        for _ in range(sum(half)):
38            for i in range(26):
39                if half[i] == 0:
40                    continue
41                half[i] -= 1
42                ways = count_perms(half, k)
43                if ways >= k:
44                    first.append(chr(i + ord("a")))
45                    break
46                else:
47                    k -= ways
48                    half[i] += 1
49        left = "".join(first)
50        return left + mid + left[::-1]