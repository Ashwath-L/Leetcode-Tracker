# Last updated: 8/8/2026, 8:17:01 PM
1class Solution:
2    def validSequence(self, word1, word2):
3        n, m = len(word1), len(word2)
4        suffix = [m] * (n + 1)
5        j = m - 1
6        for i in range(n - 1, -1, -1):
7            suffix[i] = suffix[i + 1]
8            if j >= 0 and word1[i] == word2[j]:
9                suffix[i] = j
10                j -= 1
11        j = 0              
12        used_mismatch = False
13        ans = []
14        for i in range(n):
15            if j >= m:
16                break
17            if word1[i] == word2[j]:
18                ans.append(i)
19                j += 1
20            elif not used_mismatch and suffix[i + 1] <= j + 1:
21                used_mismatch = True
22                ans.append(i)
23                j += 1
24        if j == m:
25            return ans
26        return []