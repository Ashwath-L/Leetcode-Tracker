// Last updated: 7/9/2026, 3:07:18 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
        int a = num%10;
        if (num==0){
            return true;
        }else{
            if (a==0){
                return false;
            }else{
                return true;
            }
        }
    }
}