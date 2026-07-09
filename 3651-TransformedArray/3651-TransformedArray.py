# Last updated: 7/9/2026, 3:06:51 PM
class Solution:
    def constructTransformedArray(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [0] * n
        
        for i in range(n):
            target_idx = (i + nums[i]) % n
            result[i] = nums[target_idx]
            
        return result