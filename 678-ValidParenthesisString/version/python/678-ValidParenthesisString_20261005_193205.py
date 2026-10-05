# Last updated: 10/5/2026, 7:32:05 PM
1class Solution:
2    def checkValidString(self, s: str) -> bool:
3        bMin, bMax=0, 0
4        for c in s:
5            bMin+=(c=='(')-(c==')')-(c=='*')
6            bMax+=(c=='(')-(c==')')+(c=='*')
7            if bMax<0: return False
8            bMin=max(bMin, 0)
9        return bMin==0