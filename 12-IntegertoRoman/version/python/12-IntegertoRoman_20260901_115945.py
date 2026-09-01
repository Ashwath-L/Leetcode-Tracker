# Last updated: 9/1/2026, 11:59:45 AM
1class Solution:
2    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
3        n = len(nums)
4        nums.sort()
5        ans = []
6        for i in range (n):
7            if i >0 and nums[i]==nums [i -1]:
8                continue 
9            for j in range (i+1 , n ):
10                if j >i+1 and nums[j]==nums[j-1]:
11                    continue 
12                l = j +1
13                r = n-1 
14                while l <r :
15                    s = nums[i]+nums[j]+nums[l]+nums[r]
16                    if s ==target :
17                        ans.append((nums[i],nums[j],nums[l],nums[r]))
18                        while l <r and nums[l]==nums[l+1]: #skip for c 
19                            l+=1
20                        l+=1
21                    elif s >target :
22                        r-=1
23                    else :
24                        l+=1
25        return ans 
26