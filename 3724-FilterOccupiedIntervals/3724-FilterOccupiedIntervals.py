# Last updated: 7/9/2026, 3:06:49 PM
class Solution:
    def filterOccupiedIntervals(self, occupiedIntervals: List[List[int]], freeStart: int, freeEnd: int) -> List[List[int]]:
        occupiedIntervals.sort()
        a = []
        for b in occupiedIntervals:
            if not a or b[0] > a[-1][1] + 1:
                a.append([b[0], b[1]])
            else:
                a[-1][1] = max(a[-1][1], b[1])
        c = []
        for d in a:
            e = d[0]
            f = d[1]
            if f < freeStart or e > freeEnd:
                c.append([e, f])
            else:
                if e < freeStart:
                    c.append([e, freeStart - 1])
                if f > freeEnd:
                    c.append([freeEnd + 1, f])
        return c