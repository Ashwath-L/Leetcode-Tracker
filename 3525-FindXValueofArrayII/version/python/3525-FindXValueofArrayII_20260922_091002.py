# Last updated: 9/22/2026, 9:10:02 AM
1class Solution:
2    def resultArray(self, nums: List[int], k: int, queries: List[List[int]]) -> List[int]:
3        n = len(nums)
4        nums = [x % k for x in nums]
5        
6        tree_prod = [0] * (4 * n)
7        tree_remain = [[0] * k for _ in range(4 * n)]
8        
9        def merge(left_prod, left_remain, right_prod, right_remain):
10            prod = (left_prod * right_prod) % k
11            remain = list(left_remain)
12            for i in range(k):
13                remain[(i * left_prod) % k] += right_remain[i]
14            return prod, remain
15
16        def build(node, l, r):
17            if l == r:
18                val = nums[l]
19                tree_prod[node] = val
20                rem = [0] * k
21                rem[val] = 1
22                tree_remain[node] = rem
23                return
24            mid = (l + r) // 2
25            build(2 * node, l, mid)
26            build(2 * node + 1, mid + 1, r)
27            p_l, rem_l = tree_prod[2 * node], tree_remain[2 * node]
28            p_r, rem_r = tree_prod[2 * node + 1], tree_remain[2 * node + 1]
29            tree_prod[node], tree_remain[node] = merge(p_l, rem_l, p_r, rem_r)
30
31        def update(node, l, r, idx, val):
32            if l == r:
33                tree_prod[node] = val
34                rem = [0] * k
35                rem[val] = 1
36                tree_remain[node] = rem
37                return
38            mid = (l + r) // 2
39            if idx <= mid:
40                update(2 * node, l, mid, idx, val)
41            else:
42                update(2 * node + 1, mid + 1, r, idx, val)
43            p_l, rem_l = tree_prod[2 * node], tree_remain[2 * node]
44            p_r, rem_r = tree_prod[2 * node + 1], tree_remain[2 * node + 1]
45            tree_prod[node], tree_remain[node] = merge(p_l, rem_l, p_r, rem_r)
46
47        def query(node, l, r, ql, qr):
48            if ql <= l and r <= qr:
49                return tree_prod[node], tree_remain[node]
50            mid = (l + r) // 2
51            if qr <= mid:
52                return query(2 * node, l, mid, ql, qr)
53            elif ql > mid:
54                return query(2 * node + 1, mid + 1, r, ql, qr)
55            else:
56                p_l, rem_l = query(2 * node, l, mid, ql, qr)
57                p_r, rem_r = query(2 * node + 1, mid + 1, r, ql, qr)
58                return merge(p_l, rem_l, p_r, rem_r)
59
60        build(1, 0, n - 1)
61        
62        ans = []
63        for index_i, value_i, start_i, xi in queries:
64            v = value_i % k
65            update(1, 0, n - 1, index_i, v)
66            _, rem = query(1, 0, n - 1, start_i, n - 1)
67            ans.append(rem[xi])
68            
69        return ans