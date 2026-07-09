// Last updated: 7/9/2026, 3:06:57 PM
class Solution {
public:
    int sumOfTheDigitsOfHarshadNumber(int x) {
        if(x<10){
            return x;
        }else if(x==100){
            return 1;
        }else if(x%10==0){
            return x/10;
        }else{
            int a = x%10;
            int b = x-a;
            int c = x/10;
            int d=a+c;
            int e=-1;
            if (x%d==0){
                return d;
            }else{
                return e;
            }
        }
    }
};