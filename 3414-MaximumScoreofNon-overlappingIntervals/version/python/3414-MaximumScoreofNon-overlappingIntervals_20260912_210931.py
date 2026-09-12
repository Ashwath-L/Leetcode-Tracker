# Last updated: 9/12/2026, 9:09:31 PM
1class Solution:
2    def maximumWeight(self, intervals: List[List[int]]) -> List[int]:
3        sortedIntervals = [(r, l, weight, i) for i, (l, r, weight) in enumerate(intervals)]
4        sortedIntervals.sort(key=lambda x: x[0])
5
6        dp = [[(0, []) for _ in range(5)] for _ in range(len(intervals) + 1)]
7
8        for i, (end, start, weight, originalIndex) in enumerate(sortedIntervals):
9
10            k = bisect_left(sortedIntervals, (start,), hi=i)
11            
12            for j in range(1, 5):
13                prevWeight, prevIndices = dp[k][j - 1]
14                
15                skip = dp[i][j]
16            
17                takeWeight = prevWeight - weight
18                takeIndices = sorted(prevIndices + [originalIndex])
19                take = (takeWeight, takeIndices)
20                
21                dp[i + 1][j] = min(skip, take)
22
23        return dp[-1][4][1]