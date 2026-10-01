# Last updated: 10/1/2026, 2:55:44 PM
1class Solution:
2    def longestPalindrome(self, s: str) -> int:
3        char_set = set()
4        length = 0
5        for char in s:
6            if char in char_set:
7                char_set.remove(char)
8                length += 2
9            else:
10                char_set.add(char)
11        if char_set:
12            length += 1
13        return length