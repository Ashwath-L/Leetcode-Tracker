// Last updated: 7/9/2026, 3:08:35 PM
class Solution {
public:
    bool checkPerfectNumber(int num) {
        int a = 0;
        for (int i=1;i<num;i++){
            if(num%i==0){
                a+=i;
            }
        }
        if(a==num){
            return true;
        }else{
            return false;
        }
    }
};