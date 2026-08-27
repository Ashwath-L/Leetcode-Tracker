# Last updated: 8/27/2026, 8:55:06 PM
1class Solution:
2    def lexGreaterPermutation(self, s: str, target: str) -> str:
3        n = len(s)
4        cnt = [0] * 26
5        for c in s:
6            cnt[ord(c) - ord('a')] += 1
7        for i in range(n - 1, -1, -1):
8            remain = cnt[:]
9            possible = True
10            for j in range(i):
11                x = ord(target[j]) - ord('a')
12                if remain[x] == 0:
13                    possible = False
14                    break
15                remain[x] -= 1
16            if not possible:
17                continue
18            target_char = ord(target[i]) - ord('a')
19            for c in range(target_char + 1, 26):
20                if remain[c] == 0:
21                    continue
22                ans = target[:i]
23                ans += chr(ord('a') + c)
24                remain[c] -= 1
25                for x in range(26):
26                    ans += chr(ord('a') + x) * remain[x]
27
28                return ans
29
30        return ""