# Last updated: 10/1/2026, 3:11:59 PM
1from heapq import *
2
3
4class MedianFinder:
5    def __init__(self):
6        self.small = []  # the smaller half of the list, max heap (invert min-heap)
7        self.large = []  # the larger half of the list, min heap
8
9    def addNum(self, num):
10        if len(self.small) == len(self.large):
11            heappush(self.large, -heappushpop(self.small, -num))
12        else:
13            heappush(self.small, -heappushpop(self.large, num))
14
15    def findMedian(self):
16        if len(self.small) == len(self.large):
17            return float(self.large[0] - self.small[0]) / 2.0
18        else:
19            return float(self.large[0])
20
21# 18 / 18 test cases passed.
22# Status: Accepted
23# Runtime: 388 ms