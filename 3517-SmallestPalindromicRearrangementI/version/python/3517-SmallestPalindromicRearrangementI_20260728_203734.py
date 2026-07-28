# Last updated: 7/28/2026, 8:37:34 PM
1class Solution(object):
2    def smallestPalindrome(self, s):
3        freq = {}
4        for ch in s:
5            freq[ch] = freq.get(ch, 0) + 1
6        left = []
7        middle = ""
8        for ch in sorted(freq.keys()):
9            left.append(ch * (freq[ch] // 2))
10            if freq[ch] % 2 == 1:
11                middle = ch
12        left = "".join(left)
13        right = left[::-1]
14        return left + middle + right