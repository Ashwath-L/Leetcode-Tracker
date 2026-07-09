// Last updated: 7/9/2026, 3:07:04 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int num=100;
        int m =10;
        if (purchaseAmount%10==0){
            int total =num-purchaseAmount;
            return total;
        }else if(purchaseAmount<10){
            if(purchaseAmount>=5){
                int total = num-10;
                return total;
            }else{
                return num;
            }
        }else{
            if(purchaseAmount%10>=5){
                int a=purchaseAmount%10;
                int paa=m-a;
                int pa=purchaseAmount+paa;
                int total=num-pa;
                return total;
            }else{
                int a=purchaseAmount%10;
                int paa=purchaseAmount-a;
                int total=num-paa;
                return total;
            }
            
        }

    }
}
