# Last updated: 7/31/2026, 8:25:54 PM
1class Solution:
2    def minimumPushes(self, word: str) -> int:
3        from collections import Counter
4
5        f = sorted(Counter(word).values(), reverse=True)
6        return sum((i // 8 + 1) * c for i, c in enumerate(f))