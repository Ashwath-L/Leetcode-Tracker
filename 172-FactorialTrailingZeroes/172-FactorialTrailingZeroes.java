// Last updated: 7/9/2026, 3:09:45 PM
class Solution {
    public int trailingZeroes(int n) {
        int c=0;
        while(n>=5){
            c+=n/5;
            n/=5;
        }
        return c;
    }
}