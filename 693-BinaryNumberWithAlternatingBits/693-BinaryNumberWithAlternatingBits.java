// Last updated: 7/9/2026, 3:08:07 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        int a=0;
        int x=n>>1;
        while(n!=0){
            
            if ((n&1)==(x&1)){
                break;
            }else{
                n=n>>1;
                x=x>>1;
            }
        }if (n==0){
            return true;
        }else {
            return false;
        }
    }
}