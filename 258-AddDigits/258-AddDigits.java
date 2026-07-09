// Last updated: 7/9/2026, 3:08:58 PM
class Solution {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        int remainder = num % 9;
        if (remainder ==0){
            return 9;
        }else{
            return remainder;
        }
    }
}