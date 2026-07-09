// Last updated: 7/9/2026, 3:07:35 PM
class Solution {
    public int countOdds(int low, int high) {
        int a=0;
        for (int i =low;i<=high;i++){
            a++;
        }
        if(low%2!=0 && high%2!=0){
            return (a/2)+1;
        }else{
            return a/2;
        }
    }
}