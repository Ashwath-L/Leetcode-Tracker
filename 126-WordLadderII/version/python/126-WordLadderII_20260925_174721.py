# Last updated: 9/25/2026, 5:47:21 PM
1from collections import defaultdict, deque
2
3class Solution:
4    def findLadders(self, beginWord, endWord, wordList):
5        s = set(wordList)
6
7        if endWord not in s:
8            return []
9
10        q = deque([beginWord])
11        d = {beginWord: 0}
12        p = defaultdict(list)
13
14        while q:
15            a = q.popleft()
16
17            for i in range(len(a)):
18                for j in range(26):
19                    b = a[:i] + chr(97+j) + a[i+1:]
20
21                    if b not in s:
22                        continue
23
24                    if b not in d:
25                        d[b] = d[a] + 1
26                        p[b].append(a)
27                        q.append(b)
28
29                    elif d[b] == d[a] + 1:
30                        p[b].append(a)
31
32            if endWord in d and d[a] >= d[endWord]:
33                break
34
35        if endWord not in d:
36            return []
37
38        ans = []
39
40        def f(a, x):
41            if a == beginWord:
42                ans.append(x[::-1])
43                return
44
45            for b in p[a]:
46                f(b, x + [b])
47
48        f(endWord, [endWord])
49
50        return ans