# Last updated: 8/16/2026, 9:27:41 AM
1class Solution(object):
2    def nearestDrone(self, drones, target):
3
4        a = -1
5        b = float('inf')
6        for c in range(len(drones)):
7            d = abs(drones[c][0] - target[0]) + abs(drones[c][1] - target[1])
8            if d <= drones[c][2] and d < b:
9                b = d
10                a = c
11        return a