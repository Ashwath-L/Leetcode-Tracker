// Last updated: 7/9/2026, 3:05:12 PM
class Solution {
    public int maxDistance(String s) {
        int u=0,d=0,l=0,r=0,q=0;
        for(char c:s.toCharArray()){
            if(c=='U') u++;
            else if(c=='D') d++;
            else if(c=='L') l++;
            else if(c=='R') r++;
            else q++;
        }
        return Math.abs(u-d)+Math.abs(l-r)+q;
    }
}