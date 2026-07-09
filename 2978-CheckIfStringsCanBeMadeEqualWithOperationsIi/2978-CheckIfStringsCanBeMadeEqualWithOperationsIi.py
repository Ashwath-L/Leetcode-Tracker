# Last updated: 7/9/2026, 3:07:03 PM
class Solution(object):
    def checkStrings(self, s1, s2):
        even1 = sorted(s1[0::2])
        odd1 = sorted(s1[1::2])
        
        even2 = sorted(s2[0::2])
        odd2 = sorted(s2[1::2])
        
        return even1 == even2 and odd1 == odd2