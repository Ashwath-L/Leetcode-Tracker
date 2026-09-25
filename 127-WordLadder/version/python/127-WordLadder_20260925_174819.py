# Last updated: 9/25/2026, 5:48:19 PM
1from collections import deque
2
3class Solution:
4    def ladderLength(self, beginWord, endWord, wordList):
5        s = set(wordList)
6        q = deque([(beginWord, 1)])
7
8        if endWord not in s:
9            return 0
10
11        while q:
12            a, d = q.popleft()
13
14            for i in range(len(a)):
15                for j in range(26):
16                    b = a[:i] + chr(97+j) + a[i+1:]
17
18                    if b == endWord:
19                        return d + 1
20
21                    if b in s:
22                        s.remove(b)
23                        q.append((b, d + 1))
24
25        return 0