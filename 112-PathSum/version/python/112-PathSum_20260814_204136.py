# Last updated: 8/14/2026, 8:41:36 PM
1class Solution:
2    def isPalindrome(self, s):
3        s = ''.join(c.lower() for c in s if c.isalnum())
4        return s == s[::-1]