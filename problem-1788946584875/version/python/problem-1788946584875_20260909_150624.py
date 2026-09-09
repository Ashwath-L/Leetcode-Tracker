# Last updated: 9/9/2026, 3:06:24 PM
class Solution:
    def countCommas(self, n: int) -> int:
        k = int(log10(n)) // 3        
        return k * (n + 1) - (1000**(k + 1) - 1000) // 999