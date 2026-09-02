# Last updated: 9/2/2026, 9:39:48 AM
1class Solution(object):
2    def canConstruct(self, ransomNote, magazine):
3        a=len(ransomNote)
4        b=list(ransomNote)
5        c=list(magazine)
6        for i in b:
7            for j in c:
8                d=0
9                if i==j:
10                    c.remove(j)
11                    a-=1
12                    break
13        if(a==0):
14            return True
15        else:
16            return False
17    
18        