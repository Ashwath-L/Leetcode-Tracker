# Last updated: 8/31/2026, 4:23:05 PM
1class Solution:
2    def nodesBetweenCriticalPoints(self, head: Optional[ListNode]) -> List[int]:
3        i, sz, p0, p, minD= 1, 0, -1, -1, 2**31
4        x0, x1= head.val, head.next.val
5        less, bigger= x1<x0, x1>x0
6        Next=head.next.next
7        while Next:
8            x=Next.val
9            bigger1, less1=x>x1, x<x1
10            if (less and bigger1) or (bigger and less1):
11                if sz==0: p0=i
12                sz+=1
13                if p!=-1: minD=min(minD, i-p)
14                p=i
15            bigger, less=bigger1, less1
16            x1=x
17            i+=1
18            Next=Next.next
19        if sz<=1: return [-1,-1]
20        else: return [minD, p-p0]
21        
22        