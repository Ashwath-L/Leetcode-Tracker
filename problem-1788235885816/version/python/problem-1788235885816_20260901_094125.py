# Last updated: 9/1/2026, 9:41:25 AM
1class Solution:
2    def minMoves(self, classroom: List[str], energy: int) -> int:
3        m, n = len(classroom), len(classroom[0])
4        start = None
5        litter = {}
6
7        for r in range(m):
8            for c in range(n):
9                if classroom[r][c] == 'S':
10                    start = (r, c)
11                elif classroom[r][c] == 'L':
12                    litter[(r, c)] = len(litter)
13
14        k = len(litter)
15        target = (1 << k) - 1
16
17        q = deque([(start[0], start[1], 0, energy)])
18        visited = {(start[0], start[1], 0, energy)}
19
20        moves = 0
21        directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]
22
23        while q:
24            for _ in range(len(q)):
25                r, c, mask, curr_energy = q.popleft()
26
27                if mask == target:
28                    return moves
29
30                for dr, dc in directions:
31                    nr, nc = r + dr, c + dc
32
33                    if not (0 <= nr < m and 0 <= nc < n):
34                        continue
35
36                    if classroom[nr][nc] == 'X':
37                        continue
38                    if curr_energy == 0:
39                        continue
40                    new_energy = curr_energy - 1
41                    new_mask = mask
42                    if classroom[nr][nc] == 'L':
43                        idx = litter[(nr, nc)]
44                        new_mask |= 1 << idx
45                    if classroom[nr][nc] == 'R':
46                        new_energy = energy
47                    if new_energy == 0 and classroom[nr][nc] != 'R':
48                        if new_mask != target:
49                            continue
50
51                    state = (nr, nc, new_mask, new_energy)
52
53                    if state not in visited:
54                        visited.add(state)
55                        q.append(state)
56
57            moves += 1
58
59        return -1    