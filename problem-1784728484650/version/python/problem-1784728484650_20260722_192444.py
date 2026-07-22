# Last updated: 7/22/2026, 7:24:44 PM
1class Solution:
2    def maxActiveSectionsAfterTrade(self, s: str, queries: List[List[int]]) -> List[int]:
3        ones = s.count('1')
4        zs, ze = zip(*((mo.start(), mo.end() - 1) for mo in re.finditer('0+', s))) if '0' in s else ((), ())
5        nblocks = len(zs)
6        V = list(map(sum, pairwise(b - a + 1 for a, b in zip(zs, ze))))
7        nv = len(V)
8        sparse = [V]
9        half = 1
10        while half * 2 <= nv:
11            prev = sparse[-1]
12            sparse.append(list(map(max, prev, prev[half:])))
13            half *= 2
14
15        def rmq(lo, hi):                              
16            t = (hi - lo + 1).bit_length() - 1
17            return max(sparse[t][lo], sparse[t][hi - (1 << t) + 1])
18
19        def clip(j, l, r):                            
20            return V[j] - max(0, l - zs[j]) - max(0, ze[j + 1] - r)
21
22        def gain(l, r):
23            if nblocks < 2:
24                return 0
25            ja = bisect_left(ze, l)                   
26            jb = bisect_right(zs, r) - 2             
27            if ja > jb:
28                return 0
29            return max(clip(ja, l, r), clip(jb, l, r), rmq(ja + 1, jb - 1) if jb - ja >= 2 else 0)
30
31        return [ones + gain(l, r) for l, r in queries]