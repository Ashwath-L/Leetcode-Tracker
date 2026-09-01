# Last updated: 9/1/2026, 11:58:06 AM
1class Solution:
2    def letterCombinations(self, digits):
3        if not digits: return []
4        mp = {"2":"abc","3":"def","4":"ghi","5":"jkl",
5              "6":"mno","7":"pqrs","8":"tuv","9":"wxyz"}
6        ans = []
7        def bt(i, cur):
8            if i == len(digits):
9                ans.append(cur)
10                return
11            for c in mp[digits[i]]:
12                bt(i + 1, cur + c)
13        bt(0, "")
14        return ans