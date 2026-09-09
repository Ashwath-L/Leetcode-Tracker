# Last updated: 9/9/2026, 9:20:44 AM
1class Solution(object):
2    def twoSum(self, numbers, target):
3        n=target
4        numbers.sort()
5        c=list()
6        j=len(numbers)-1
7        i=0
8        while(True):
9            d=numbers[i]+numbers[j]
10            if(d==n):
11                c.append(i+1)
12                c.append(j+1)
13                return c
14            if(d>n):
15                j-=1
16            if(d<n):
17                i+=1
18        
19            
20
21